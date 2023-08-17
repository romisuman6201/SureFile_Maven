package COM.STRING;

import java.util.Scanner;

public class MaximamArrayElementinArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter Size of Array is :");
		size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			
		}
		int max=a[0];
		for (int j = 1; j < a.length; j++) {
			if(a[j]>max)
				max=a[j];
		}
		System.out.println("Maximam value of Array is :"+max);

	}

}
