package com.hit;
import java.util.Scanner;
import java.util.Map;

public class BTVN_Buoi3_HIT {

	//Đếm số lần xuất hiện của phần tử
	static void DemPhanTu(int arr[]) {
		int arrcount[] = new int[arr.length];
		for(int i = 0; i < arrcount.length; ++i) {
			arrcount[i] = -1;
		}
		
		for(int i = 0; i < arr.length; ++i) {
			int count=1;
			for(int j = i+1; j < arr.length; ++j) {
				if(arr[i] == arr[j]) {
					count++;
					arrcount[j] = 0;
				}
			}
			if(arrcount[i] != 0) {
				arrcount[i] = count;
			}
		}
		for(int i = 0; i < arrcount.length; ++i) {
			if(arrcount[i] > 0) {
				System.out.println("\n" + arr[i] + " xuat hien " + arrcount[i] + " lan.");
			}
		}
		
		
	}
	
	
	//Thêm 1 phần tử vào mảng
	static int[] ThemPhanTu(int arr[], int pos, int value) {
		int newarr[] = new int[arr.length + 1];
		int k = pos - 1;
		if(pos > arr.length) {
			for(int i = 0; i < arr.length; ++i) {
				newarr[i] = arr[i];
			}
			newarr[newarr.length - 1] = value;
		}else if(pos == 1) {
			for(int i = 0; i < arr.length; ++i) {
				newarr[i+1] = arr[i];
			}
			newarr[0] = value;
		}else {
			for(int i = 0; i < arr.length; ++i) {
				if(i != k) {
					newarr[i] = arr[i];
				}else {
					break;
				}
			}
			newarr[k] = value;
			for(int i = k+1; i <= arr.length; ++i) {
				newarr[i] = arr[i-1];
			}
			
		}
		
		return newarr;
	}
	
	//Xóa 1 phần tư khỏi mảng 
	static int[] XoaPhanTu(int arr[], int pos) {
		int k = pos - 1;
		int []newarr = new int[arr.length-1];
		if(pos == 1) {
			for(int i = 0; i < newarr.length; ++i) {
				newarr[i] = arr[i+1];
			}
		}else if(pos > arr.length) {
			for(int i = 0; i < newarr.length; ++i) {
				newarr[i] = arr[i];
			}
		}else {
			for(int i = 0; i < newarr.length; ++i) {
				if(i != k) {
					newarr[i] = arr[i];
				}else {
					break;
				}
			}
			for(int i = k; i < newarr.length; ++i) {
				newarr[i] = arr[i+1];
			}
		}
		
		return newarr;
	}
	
	//Sắp xếp mảng tăng dần 
	static void SapXep(int arr[]) {
		for(int i = 0; i < arr.length; ++i) {
			for(int j = i+1; j < arr.length; ++j) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	//Xuất mảng
	static void XuatMang(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
	
	//Kiểm tra đối xứng
//	static boolean KiemTraDoiXung(String str) {
//		int left
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap so phan tu trong mang: n = ");
		int n = input.nextInt();
		int arr[] = new int[n];
		System.out.println("Nhap cac phan tu cho mang: ");
		for(int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println("Xuat mang:");
		XuatMang(arr);
		
		//Đếm số lần xuất hiện của phần tử trong mảng
//		DemPhanTu(arr);
		
		//Sắp xếp mảng
//		SapXep(arr);
//		System.out.println("\nSap xep mang:");
//		XuatMang(arr);
		
		//Chèn 1 phần tử vào mảng
//		System.out.print("\nnhập phần tử muốn chèn: ");
//		int value = input.nextInt();
//		System.out.print("nhập vị trí muốn chèn: ");
//		int pos;
//		do {
//			pos = input.nextInt();
//		}while(pos <= 0);
//		arr = ThemPhanTu(arr, pos, value);
//		System.out.println("Mang sau khi chen:");
//		XuatMang(arr);
		
		//Xóa 1 phần tử khỏi mảng
//		System.out.print("\nnhập vị trí muốn xóa: ");
//		int pos;
//		do {
//			pos = input.nextInt();
//		}while(pos <= 0);
//		arr = XoaPhanTu(arr, pos);
//		System.out.println("Mang sau khi xoa: ");
//		XuatMang(arr);
		
		//Kiểm tra chuỗi đối xứng
//		System.out.println("Nhap chuoi bat ky: ");
//		String str = input.nextLine();
		
		
	}

}
 