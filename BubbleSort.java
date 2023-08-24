package Array;

import java.util.Scanner;

public class BubbleSort {
	
	public static int[] sortArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp= a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]= new int[5];
		
		for(int i=0;i<a.length;i++) {
		    System.out.println("Enter A Number");
			a[i]= sc.nextInt();
		}
		
		System.out.println("Unsorted Array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
	//	int a[]= {12,21,14,29,35};
		
		System.out.println("Sorted Array");
		int res[]= sortArray(a);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}

	}

}
