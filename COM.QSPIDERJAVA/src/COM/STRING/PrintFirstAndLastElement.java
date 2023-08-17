package COM.STRING;

import java.util.Scanner;

public class PrintFirstAndLastElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array :");
		int size;
		size=sc.nextInt();
		int [] a=new int [size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("First and Last Elements are :");
		 {
			System.out.println(a[0]);
			System.out.println(a[a.length-1]
					
					
					);
			
		}
		
		

	}

}
