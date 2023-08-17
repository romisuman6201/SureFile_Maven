package COM.STRING;

import java.util.Scanner;

public class SortingOfArrayInAscendingOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		int temp;
		System.out.println("Enter Size of Array is :");
		size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		for (int j = 0; j < a.length; j++) {
			for (int k = j+1; k < a.length-1; k++) {
				if(a[j]>a[k]) {
					temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
				
			}
			
		}
	for (int m = 0; m < a.length; m++) {
		System.out.println("a["+m+"]="+a[m]);
	}
		

	}

}
