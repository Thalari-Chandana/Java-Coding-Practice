

import java.util.Scanner;

class Niven {
	static void checkNiven(int n) {
		int sum=0;
		int digit=0;
		int original=n;
		while(n>0) {
			digit=n%10;	//getting last digit 
			sum=sum+digit;		//adding last digit into sum
			n=n/10;		//sending remaining numbers back to while loop
		}
		if(original%sum==0) {
			System.out.println("niven");
		}else {
			System.out.println("Not niven");
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Enter a num");
		Scanner sc=new Scanner(System.in);
		checkNiven(sc.nextInt());
		sc.close();
	}

}
