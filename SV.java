package qlySV;

import java.util.Scanner;

public class SV {
	

	private String hoTen ;
	private String queQuan ;
	private float gpa ;
	private String lop ;
	private String khoa ;
	private String mSV ;
	
	public void nhap( Scanner sc) {
		System.out.println("- Nhap thong tin Sinh Vien ");
		System.out.println(" Ho ten : ");
		this.hoTen = sc.nextLine() ;
		System.out.println(" Que quan : ");
		this.queQuan = sc.nextLine() ;
		System.out.println(" Khoa : ");
		this.khoa = sc.nextLine() ;
		System.out.println(" Lop : ");
		this.lop = sc.nextLine() ;
		System.out.println(" Ma Sinh vien : ");
		this.mSV = sc.nextLine() ;
		System.out.println(" GPA : ");
		this.gpa = sc.nextFloat() ;
		sc.nextLine() ;

	}
	
	public void xuat() {
		System.out.println(this.mSV +" | " 
						+ this.hoTen + " | "
						+ this.queQuan + " | "
						+ this.khoa + " | "
						+ this.lop + " | "
						+ this.gpa );
		
	}
	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public void setmSV(String mSV) {
		this.mSV = mSV;
	}

	public String getmSV() {
		return mSV;
	}

	public String getHoTen() {
		return hoTen;
	}


	public float getGpa() {
		return gpa;
	}

}
