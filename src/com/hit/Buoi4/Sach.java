package com.hit.Buoi4;
import java.util.Scanner;

public class Sach {
	static Scanner input = new Scanner(System.in);
	
	private String maSach;
	private String tenSach;
	private String tacGia;
	private String nhaXuatBan;
	private int namXuatBan;
	
	public Sach nhap() {

		input.nextLine();
		System.out.print("Nhap ma sach: ");
		this.maSach = input.nextLine();
		System.out.print("Nhap ten sach: ");
		this.tenSach = input.nextLine();
		System.out.print("Nhap ten tac gia: ");
		this.tacGia = input.nextLine();
		System.out.print("Nhap nha xuat ban: ");
		this.nhaXuatBan = input.nextLine();
		System.out.print("Nhap nam xuat ban: ");
		this.namXuatBan = input.nextInt();
		
		return this;
	}
	
	public void xuat() {
		System.out.printf("%-15s", maSach);
		System.out.printf("%-15s", tenSach);
		System.out.printf("%-15s", tacGia);
		System.out.printf("%-15s", nhaXuatBan);
		System.out.printf("%-15s\n", namXuatBan);
	}
	
	public Sach() {
		this.maSach = "NULL";
		this.tenSach = "NULL";
		this.tacGia = "NULL";
		this.nhaXuatBan = "NULL";
		this.namXuatBan = 0;
	}
	
	public Sach(String ms, String ts, String tg, String nxb, int nam) {
		this.maSach = ms;
		this.tenSach = ts;
		this.tacGia = tg;
		this.nhaXuatBan = nxb;
		this.namXuatBan = nam;
	}
	
	public String getMaSach() {
		return this.maSach;
	}
	
	public String getTenSach() {
		return this.tenSach;
	}
	
	public String getTacGia() {
		return this.tacGia;
	}
	
	public String getNXB() {
		return this.getNXB();
	}
	
	public int getNamNXB() {
		return this.namXuatBan;
	}
	
	public void setMaSach(String x) {
		this.maSach = x;
	}
	
	public void setTenSach(String x) {
		this.tenSach = x;
	}
	
	public void setTacGia(String x) {
		this.tacGia = x;
	}
	
	public void setNXB(String x) {
		this.nhaXuatBan = x;
	}
	
	public void setNamXuatBan(int x) {
		this.namXuatBan = x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		do {
			System.out.print("Nhap so luong sach: ");
			n = input.nextInt();
		}while(n <= 0);
		
		
		Sach x[] = new Sach[n];
		for(int i = 0; i < n; i++) {
			x[i] = new Sach();
			x[i].nhap();
		}
		
		System.out.printf("Ma sach        ");
		System.out.printf("Ten sach       ");
		System.out.printf("Tac gia        ");
		System.out.printf("Nha Xuat Ban   ");
		System.out.printf("Nam Xuat Ban   \n");
		for(int i = 0; i < n; i++) {
			x[i].xuat();
		}
		
		x[0].setTenSach("dat");
		System.out.println(x[0].getTenSach());
		
		
		
		input.close();
	}

}
