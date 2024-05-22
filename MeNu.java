package qlySV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MeNu {
	
	ArrayList<SV> menu = new ArrayList<>() ;
	
	public void them( SV a) {
		menu.add(a) ;
		
	}
	
	public void sapXep() {
		Collections.sort(menu, new Comparator<SV>() {
			public int compare( SV o1 , SV o2) {
				int check = o1.getHoTen().compareTo(o2.getHoTen()) ;
				if( check != 0 )
					return check ;
				else {
					if( o1.getGpa() > o2.getGpa())
						return -1 ;
					else
						return 1 ;
				}
			}
		});
	}
	
	public void in() {
		System.out.println(" - Sô luong sinh vien : " +  kichThuoc());
		sapXep() ;
		for( SV i : menu) {
			i.xuat();
		}
		
	}
	
	
	public SV kTra( String ma) {

		for(SV sv : menu) {
			if( sv.getmSV().equals(ma))
				return sv ;
		}
		return null ;
		
	}
	
	// code nốt hàm thống kê 
	// lỗi không in ra được sinh vien có tên trùng nhau , mà nó lại in ra tất cả các tên sv có trong menu
	public void thongKe(Scanner sc) {
		System.out.println("-------- Thong ke theo ? --------\n"
				+ "1 . Họ tên\n "
				+ "2 . Quê quán\n"
				+ "3 . Khoa\n"
				+ "4 . Lop\n"
				+ "5 . Gpa \n");
		System.out.println(" - Nhập lưa chọn : ");
		int tk = sc.nextInt() ;
		sc.nextLine();
		
		if(tk == 1) {
			System.out.println(" - Nhap ten : ");
			String hten = sc.nextLine() ;
			for( SV i : menu) {
				if( i.getHoTen().compareTo(hten) == 0 ) { 
//					System.out.println(" - Thông tin các sinh viên có tên :" + hten );
					i.xuat();
				}
					
			}
		}
		else if( tk == 2) {
			System.out.println(" - Nhap quê quán ");
			String qq = sc.nextLine() ;
			for( SV i : menu) {
			if( i.getQueQuan().compareTo(qq) == 0 ) { 
//					System.out.println(" - Thông tin các sinh viên có tên :" + hten );
					i.xuat();
				}
					
			}
		}
		else if( tk == 3) {
			System.out.println(" - Nhap tên  Khoa : ");
			String khoa = sc.nextLine() ;
			for( SV i : menu) {
				if( i.getKhoa().compareTo(khoa) == 0 ) { 
//					System.out.println(" - Thông tin các sinh viên có tên :" + hten );
					i.xuat();
				}
					
			}
		}
		else if( tk == 4) {
			System.out.println(" - Nhap ten Lop : ");
			String lop = sc.nextLine() ;
			for( SV i : menu) {
				if( i.getLop().compareTo(lop) == 0 ) { 
//					System.out.println(" - Thông tin các sinh viên có tên :" + hten );
					i.xuat();
				}
					
			}
		}
		else {
			System.out.println(" - Nhap Gpa = ");
			float gpaTemp = sc.nextFloat() ;
			for( SV i : menu) {
				if( i.getGpa() == gpaTemp ) { 
//					System.out.println(" - Thông tin các sinh viên có tên :" + hten );
					i.xuat();
				}
					
			}
		}
	}
	
	public void sua( String ma, Scanner sc) {
		SV check = kTra(ma) ;
		if(check != null ) {
			check.xuat();
			System.out.println("-------- Sửa gì ? --------\n"
					+ "1 . Họ tên\n "
					+ "2 . Quê quán\n"
					+ "3 . Khoa\n"
					+ "4 . Lop\n"
					+ "5 . Gpa \n");
			System.out.println(" - Nhập lưa chọn : ");
			int sG = sc.nextInt() ;
			sc.nextLine() ;
			
			if( sG == 1) {
				System.out.println(" - Nhap ten : ");
				String name = sc.nextLine() ;
				check.setHoTen(name);
			}
			else if( sG == 2) {
				System.out.println(" - Nhập quê quán : ");
				String qq = sc.nextLine() ;
				check.setQueQuan(qq);
			}
			else if( sG == 3) {
				System.out.println(" - Nhap Khoa : ");
				String k = sc.nextLine() ;
				check.setKhoa(k);
			}
			else if( sG == 4) {
				System.out.println(" - Nhập Lop : ");
				String l = sc.nextLine() ;
				check.setLop(l);
			}else {
				System.out.println(" - Nhập GPA : ");
				float diem = sc.nextFloat() ;
				check.setGpa(diem);
			}
			
			System.out.println(" OK Đã Lưu ! ");
			
			
		}
		else {
			System.out.println(" Sinh vien Khong ton tai ! ");
		}
	}
	
	public void xoa(String ma) {
		 SV check = kTra(ma) ;
		 if( check != null) {
			 menu.remove(check) ;
			 System.out.println(" Ok Đã Xóa ! ");
		 }
		 else{
				System.out.println(" Sinh vien Khong ton tai ! ");
			}
	}
	
	public int kichThuoc() {
		return menu.size() ;
	}
	
	
	
	
	

}
