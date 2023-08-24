package Array;

public class Sum {
	
	
	public static int sumNum(int a[]) {
		int sum=0;
		for(int i=1;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		System.out.println(sumNum(a));

	}

}
