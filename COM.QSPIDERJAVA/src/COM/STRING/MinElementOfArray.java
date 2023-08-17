package COM.STRING;

import java.util.Scanner;

public class MinElementOfArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter Size of Array is :");
		size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt(); //10,20,30,40,5

		}
		int min=a[0]; //10
		for (int j = 1; j < a.length; j++) {
			if(a[j]<min)  //a[1]=20  10<20 T
			min=a[j];
		}
		System.out.println("Minimum Element i s:"+min);
	}

}
