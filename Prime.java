package Array;

public class Prime {
	public static Boolean isPrime(int a) {
		int count2=0;
		for (int i=1;i<=a;i++) {
			if(a%i==0) {
				count2++;
			}
		}
			if(count2==2) {
				return true;
			}else {
				return false;
			}
		
	}
	public static void primeOfArray(int a[]) {
		
		int count =0;
		for(int i=0;i<a.length;i++) {
			boolean flag= isPrime(a[i]);
			if(flag==true) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		int a[]= {10,3,5,7,11,17,5,12};
		primeOfArray(a);

	}

}
