package com.basic_program;

import java.util.Scanner;

public class StrongNumber2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		while (num > 0) {
			int fact=1;
          int lastdigit=num%10;
          
          for (int i = 1; i < lastdigit; i++) {
        	  
        	  fact=fact*lastdigit;
			
		}
          sum=sum+fact;
          num=num/10;
		}
		if(sum==temp) {
		System.out.println(sum+ "number is Strong");

	}}
}