package Array;

import java.util.Scanner;

public class SelectionSort {
	
	public static void selectSort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
				    a[i]=a[j];
				    a[j]=temp;
				}
			}			
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+  " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a[]= new int[5];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter A Number");
			a[i]= sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
		
		selectSort(a);
	}

}
