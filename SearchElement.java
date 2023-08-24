package Array;

public class SearchElement {
	public static int searchElement(int a[], int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[]= {10,20,4,5,17,54};
		System.out.println(searchElement(a, 17));
	}

}
