package com.array;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		System.out.println("Enter Size of Array");
		Scanner sc = new Scanner(System.in);
		int size;
		size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int sum=0;
		for (int j = 0; j < a.length; j++) {
			sum=sum+a[j];
		}
		System.out.println("sum of Array is :"+sum);
		float avarage= (float)sum/a.length;
System.out.println("Avarage of Array is :"+avarage);
	}

}
