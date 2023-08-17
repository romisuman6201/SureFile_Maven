package COM.STRING;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter The size of Array :");
		size=sc.nextInt();
		int [] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("Array elements are :");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
			
		}

	}

}
