package com.hit.Buoi4;
import java.util.Scanner;


public class SinhVien {
	static Scanner input = new Scanner(System.in);
	private String maSV;
	private String hoTen;
	private float toan;
	private float ly;
	private float hoa;
	
	public SinhVien() {
		this.maSV = "null";
		this.hoTen = "null";
		this.toan = 0;
		this.ly = 0;
		this.hoa = 0;
	}
	
	public SinhVien(String a, String b, float c, float d, float e) {
		this.maSV = a;
		this.hoTen = b;
		this.toan = c;
		this.ly = d;
		this.hoa = e;
	}
	
	public String getMaSV() {
		return this.maSV;
	}
	
	public String getHoTen() {
		return this.hoTen;
	}
	
	public float getToan() {
		return this.toan;
	}
	
	public float getLy() {
		return this.ly;
	}
	
	public float getHoa() {
		return this.hoa;
	}
	
	public void setMaSV(String a) {
		this.maSV = a;
	}
	
	public void setHoTen(String b) {
		this.hoTen = b;
	}
	
	public void setToan(float c) {
		this.toan = c;
	}
	
	public void setLy(float c) {
		this.ly = c;
	}
	
	public void setHoa(float c) {
		this.hoa = c;
	}
	
	public void nhap() {
		System.out.print("Nhap ma sinh vien: ");
		input.nextLine();
		this.maSV = input.nextLine();
		System.out.print("Nhap ho ten sinh vien: ");
		this.hoTen = input.nextLine();
		do {
			System.out.print("Nhap diem toan: ");
			this.toan = input.nextFloat();
			System.out.print("Nhap diem toan: ");
			this.ly = input.nextFloat();
			System.out.print("Nhap diem toan: ");
			this.hoa = input.nextFloat();
		}while(this.toan < 0 || this.ly < 0 || this.hoa < 0);
		
	}
	
	public float DTB() {
		return (this.toan + this.hoa + this.ly)/3;
	}
	
	public void xuat() {
		float dtb = this.DTB();
		System.out.printf("%-15s", maSV);
		System.out.printf("%-15s", hoTen);
		System.out.printf("%-15s", toan);
		System.out.printf("%-15s", ly);
		System.out.printf("%-15s", hoa);
		System.out.printf("%-15s\n", dtb);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Nhap so sinh vien: ");
		int n = input.nextInt();
		SinhVien x[] = new SinhVien[n];
		//nhap thong tin sinh vien
		for(int i = 0; i < n; i++) {
			x[i] = new SinhVien();
			x[i].nhap();
		}
		
		//Xuat thong tin sinh vien
		System.out.printf("Ma SV          ");
		System.out.printf("Ho Ten         ");
		System.out.printf("Toan           ");
		System.out.printf("Ly             ");
		System.out.printf("Hoa            ");
		System.out.printf("Trung Binh     \n");
		for(int i = 0; i < n; i++) {
			x[i].xuat();
		}
		
		x[0].setHoTen("Dat dep trai");
		System.out.println(x[0].getHoTen());
		
		
		input.close();
	}

}
