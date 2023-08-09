package com.hit.btvn;

import java.util.Scanner;

public class BTVN_Buoi1_HIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// Bai 1
//		int n;
//		System.out.println("Nhap chieu dai canh hinh vuong(n > 0):");
//		do {
//			System.out.print("n = ");
//			n = input.nextInt();
//		}while(n <= 0);
//		System.out.print("\n");
//
//		for (int i = 1; i <= n; ++i) {
//			if (i == 1 || i == n) {
//				for (int j = 1; j <= n; j++) {
//					System.out.print("*");
//				}
//			} else {
//				for (int j = 1; j <= n; j++) {
//					if (j == 1 || j == n) {
//						System.out.print("*");
//					}else
//					{
//						System.out.print(" ");
//					}
//				}
//			}
//			System.out.print("\n");
//		}

		//Bai 2
//		float S = 0; 
//		int i = 1;
//		int n;
//		System.out.println("Nhap so nguyen(n > 0): ");
//		do {
//			System.out.print("n = ");
//			n = input.nextInt();
//		}while(n <= 0);
//		
//		//S = 1 + 1/2 + 1/3 + ... + 1/n
//		while(i <= n)
//		{
//			S += (float)1/i;
//			i++;
//		}
//		System.out.println("S = " + S);
//		
//		//P = 1 + 2! + 3! +...+ n!
//		i = 1;
//		int t = 1;
//		int P = 0;
//		while(i <= n)
//		{
//			t *= i;
//			P += t;
//			i++;
//		}
//		System.out.println("P = " + P);

		//Bai 3
//		int n;
//		System.out.println("Nhap so nguyen n: ");
//		do {
//			System.out.print("n = ");
//			n = input.nextInt();
//		}while(n < 2);
//		
//		int dem = 0;
//		for(int i = 1; i <= n/2; ++i)
//		{
//			if(n % i == 0)
//			{
//				dem++;
//			}
//			if(dem > 2)
//			{
//				break;
//			}
//		}
//		if(dem > 2)
//		{
//			System.out.println(n + " khong phai so nguyen to!!");
//		}else {
//			System.out.println(n + " la so nguyen to!!");
//		}
		
		
		//Bai 4
////		Ax^4 + Bx^2 + C = 0
//
//		System.out.print("Nhap he so A = ");
//		double A = input.nextFloat();
//		System.out.print("Nhap he so B = ");
//		double B = input.nextFloat();
//		System.out.print("Nhap he so C = ");
//		double C = input.nextFloat();
//		
//		double delta = B*B - 4*A*C;
//			double t1 = (-B+Math.sqrt(delta))/(2*A);
//			double t2 = (-B-Math.sqrt(delta))/(2*A);
//			double P = t1*t2;
//			double S = t1+t2;
//		
//		if(delta < 0 || S < 0 )
//		{
//			System.out.println("Phuong trinh vo nghiem");
//		}else if((delta == 0 && S > 0) || (delta >0 && P < 0)) {
//			double t =  -B/(2*A);
//			System.out.println("Phuong trinh co 2 nghiem");
//			System.out.println("x1 = " + Math.sqrt(t));
//			System.out.println("x2 = " + Math.sqrt(t)*-1);
//		}else if(delta > 0 && P == 0 && S > 0){
//			System.out.println("Phuong trinh co 3 nghiem");
//			System.out.println("x1 = 0");
//			System.out.println("x2 = " + Math.sqrt(t1));
//			System.out.println("x3 = " + Math.sqrt(t1)*-1);
//		}else {
//			System.out.println("Phuong trinh co 4 nghiem");
//			System.out.println("x1 = " + Math.sqrt(t1));
//			System.out.println("x2 = " + Math.sqrt(t1)*-1);
//			System.out.println("x3 = " + Math.sqrt(t2));
//			System.out.println("x4 = " + Math.sqrt(t2)*-1);
//		}
		
		//Bai 5
//		// Chanh : Tao : Le = 1 : 2 : 4
		int chanh, tao, le;
		System.out.println("Nhap so cac loai qua: ");
		do {
			System.out.print("chanh = ");
			chanh = input.nextInt();
			System.out.print("tao = ");
			tao = input.nextInt();
			System.out.print("le = ");
			le = input.nextInt();
		}while(chanh <= 0 || tao <= 0 || le <= 0);
		
		if(chanh > tao || chanh > le)
		{
			System.out.println("Tong so qua toi da: 0");
		}
		
		int c = chanh;
		int sum = 0;
		while(c > 0)
		{
			int	t = c*2;
			int l = c*4;
			if(t <= tao && l <= le)
			{
				sum = c + t + l;
				break;
			}else if(t <= tao && l > le) {
				--c;
			}else if(t > tao) {
				--c;
			}
		}
		System.out.print("Tong so qua toi da: " + sum);
		
		
	input.close();
	}

}
