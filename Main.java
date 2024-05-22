package qlySV;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		
		MeNu danhSachSV = new MeNu() ;
	
			while(true) {
				System.out.println("---------MENU--------\n"
						+ "1 . Them sinh vien \n"
						+ "2 . In danh sách sinh vien\n"
						+ "3 . Tim kiem sinh vien \n"
						+ "4 . Sửa thông tin Sinh Vien \n"
						+ "5 . Xóa sinh viên\n"
						+ "6 . Số lượng sinh vien đang quản lý \n"
						+ "7 . Thong ke sinh vien theo yeu cau\n"
						+ "0 . Thoat !");
				
				System.out.println(" - Nhap lua chon : ");
				int lc =sc.nextInt() ;
				sc.nextLine() ;
				
				if( lc == 1) {
					SV a = new SV() ;
					a.nhap(sc);
					danhSachSV.them(a) ;
					
				}
				else if( lc == 2) {
					danhSachSV.in(); 
				}
				else if( lc == 3) {
					System.out.println(" - Ma Sinh Vien Can tim: ");
					String ma = sc.nextLine() ;
					if(danhSachSV.kTra(ma) != null ) 
							// nó trả về một sinh vien mà => có thể gọi được các phương thức trong class SV
							danhSachSV.kTra(ma).xuat();
					else 
						System.out.println("Sinh vien khong ton tai ");
				
					
				}
				else if( lc == 4) {
					System.out.println(" - Ma Sinh Vien : ");
					String ma = sc.nextLine() ;
					danhSachSV.sua(ma, sc);
				}
				else if( lc == 5) {
					System.out.println(" - Ma Sinh Vien : ");
					String ma = sc.nextLine() ;
					danhSachSV.xoa(ma);
				}
				else if( lc == 6) {
					System.out.println(" Số lượng sinh viên : " + danhSachSV.kichThuoc()) ;
				}
				else if( lc == 7) {
					danhSachSV.thongKe(sc) ;
				}
				else {
					System.out.println(" OK cảm ơn ! ");
					break ;
				}
				
			}
	}

}
