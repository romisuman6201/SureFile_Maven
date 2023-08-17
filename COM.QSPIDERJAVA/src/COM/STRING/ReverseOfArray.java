package COM.STRING;

import java.util.Scanner;

public class ReverseOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre size of Array is :");
		int size;
		size=sc.nextInt();
		int [] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Reverse of Array are :");
		for (int j = a.length-1; j >=0; j--) {
			System.out.println("a["+j+"]="+a[j]);
		}

	}

}
