package Array;

public class Armstrong {
	
	public static boolean isArmstrong(int a) {
		int z=a;
		int count=0;
		int sum=0;
		
		while(z>0) {
			z=z/10;
			count++;
		}
		z=a;
		while(z>0) {
			int lastdigit=z%10;
			int prod=1;
			for(int i=1;i<=count;i++) {
				prod=prod*lastdigit;
			}
			sum=sum+prod;
			z=z/10;
		}
		if(sum==a) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void armstrongOfArray(int a[]) {
		int count1=0;
		
		for(int i=0;i<a.length;i++) {
		boolean flag= isArmstrong(a[i]);
		if(flag==true) {
			count1++;
		  }
	    }
		System.out.println(count1);
		
	}

	public static void main(String[] args) {
		int a[]= {153,12,15,11,18};
		armstrongOfArray(a);
	}

}
