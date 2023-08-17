package com.array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		System.out.println("Enter Size of Array");
		Scanner sc=new Scanner(System.in);
		int size;
		size=sc.nextInt();
		int [] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements are.........");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}

	}

}
