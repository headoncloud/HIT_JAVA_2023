package com.hit.Buoi4;
import java.util.Scanner;

public class HCN {
	static Scanner input = new Scanner(System.in);
	private int dai;
	private int rong;
	
	public void nhap() {
		do {
			System.out.print("Nhap chieu dai HCN: ");
			this.dai = input.nextInt();
			System.out.print("Nhap chieu rong HCN: ");
			this.rong = input.nextInt();
		}while(this.dai <= 0 || this.rong <= 0);
	}
	
	public void veHCN() {
		for(int i = 1;  i <= this.rong; i++) {
			if(i == 1 || i == this.rong) {
				for(int j = 1; j<= this.dai; j++) {
					System.out.print(" *");
				}
				System.out.printf("\n");
			}else {
				for(int j = 1; j<= this.dai; j++) {
					if(j == 1 || j == this.dai) {
						System.out.print(" *");
					}else {
						System.out.print("  ");
					}
				}
				System.out.printf("\n");
			}
		}
	}
	
	public int chuVi() {
		return (this.dai + this.rong) * 2;
	}
	
	public int dienTich() {
		return this.dai * this.rong;
	}
	
	public HCN() {
		this.dai = 1;
		this.rong = 1;
	}
	
	public HCN(int a, int b) {
		this.dai = a;
		this.rong = b;
	}
	
	public int getDai() {
		return this.dai;
	}
	
	public int getRong() {
		return this.rong;
	}
	
	public void setDai(int a) {
		this.dai = a;
	}
	
	public void setRong(int b) {
		this.rong = b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HCN a = new HCN();
		a.nhap();
		System.out.println("Chieu dai HCN: " + a.getDai());
		System.out.println("Chieu rong HCN: " + a.getRong());
		System.out.println("Chu vi HCN: " + a.chuVi());
		System.out.println("Dien tich HCN: " + a.dienTich());
		System.out.println("Ve hinh chu nhat: ");
		a.veHCN();
		
		
		
		input.close();
	}

}
