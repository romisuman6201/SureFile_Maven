package com.array;

import java.util.Scanner;

public class FirstandLast {

	public static void main(String[] args) {
		System.out.println("Enter Size of Array");
		Scanner sc=new Scanner(System.in);
		int size;
		size=sc.nextInt();
		int [] a=new int[size];
		for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
		}
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);

	}

}
