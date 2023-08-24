package Array;

import java.util.Scanner;

public class InsertionSort {
	
	public static int[] sortArray(int[] a) {
		for(int i=1;i<a.length;i++) {
			int current= a[i];
			int j=i-1;
			while(j>=0 && current<a[j]) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=current;
		} return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]= new int [5];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter A Number");
			a[i]= sc.nextInt();
		}
		
		System.out.println("Unsorted Array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		
		System.out.println();
		
		System.out.println("Sorted Array");
		int res[]=sortArray(a);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}
}
