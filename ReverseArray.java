package Array;

public class ReverseArray {
	
	public static void reverseArray(int a[]) {
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		reverseArray(a);

	}

}
