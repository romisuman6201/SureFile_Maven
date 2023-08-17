package com.basic_program;

import java.util.Scanner;

public class StrongNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = s.nextInt();

		int sum = 0;
		
		int digit = 0;
		int temp = num;
		while (num > 0) {
			digit = num % 10;
			int fact = 1;
			
			for (int i = 1; i <= digit; i++) {
				fact = fact * i;

			}
			sum = sum + fact;
			num = num / 10;

		}
		if (sum == temp) {
			System.out.println("number is strong");
		}else {
			System.out.println("Number is not strong");
		}

	}

}
