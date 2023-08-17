package COM.STRING;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter Size of an Array :");
		size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		int sum=0;
		for (int j = 0; j < a.length; j++) {
			sum=sum+a[j];
		}
		System.out.println("Sum of Array is :"+sum);
		float average=(float)sum/a.length;
		System.out.println(average);
	}

}
