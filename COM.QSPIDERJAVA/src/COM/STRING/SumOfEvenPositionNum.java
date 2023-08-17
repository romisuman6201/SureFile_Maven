package COM.STRING;

import java.util.Scanner;

public class SumOfEvenPositionNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter Size of Array :");
		size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for (int j = 0; j < a.length; j++) {
			if (j % 2 == 0) {
				sum = sum + a[j];
			}
		
		}
		System.out.println("Sum of Even position number is :" + sum);

	}

}
