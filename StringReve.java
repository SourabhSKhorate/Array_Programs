package Array;

public class StringReve {
	public static void reverseStringArray(String a[]) {
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		String a[]= {"10","20","30","40","50"};
		reverseStringArray(a);
	}

}
