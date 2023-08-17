package com.basic_program;

import java.util.Arrays;

public class Swap {
	public static void main(String[] args) {
		int a []= {36,33,18,24,30,8,10};
		for (int i = 0; i < a.length; i++) {
			if(a[i]%3==0) {
				System.out.println(a[i]);
			}
		}
		Arrays.sort(a);
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
				System.out.println(a[i]);
			}
			
		}
	}

}
