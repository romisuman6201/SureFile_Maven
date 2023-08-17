package COM.STRING;

import java.util.Scanner;

public class CopyOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter size of Array is :");
		size=sc.nextInt();
		System.out.println("Elements of Array a is :");
		int [] a=new int [size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array of copying in b is :");
		int [] b=new int[a.length];
		for (int j = 0; j < a.length; j++) {
			b[j]=a[j];
		}
		System.out.println("Printing of Array is :");
		for (int k = 0; k < b.length; k++) {
			System.out.println("b["+k+"]="+b[k]);
		}

	}

}
