package Array;

public class BinarySearch {
	public static void binarySearch(int a[],int key) {
		int low=0;
		int high=a.length-1;
		
		while(low<=high) {
		int mid=(low+high)/2;
		
		if(a[mid]==key) {
			System.out.println("Element found at "+ mid);
			break;
		}
		else
			if(a[mid]>key) {
				high=mid-1;
			}
			else
				if(a[mid]<key) {
					low=mid+1;
				}
				else
				if(mid!=key){
					System.out.println("Element not found");
					}
		}
		//System.out.println("no");
	}

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		binarySearch(a, 42);
	}

}
