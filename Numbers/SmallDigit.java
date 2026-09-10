

import java.util.Scanner;

class SmallDigit {
	static int smallDigit(int n) {
		int digit=0;
		int small=n;
		while(n>0) {
			digit=n%10;
			if(digit<small) {
				small=digit;
			}
			n=n/10;
		}
		return small;
	}
	public static void main(String[] args) {
		System.out.println("Enter a num");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int smallest=smallDigit(n);
		System.out.println("smallest digit in "+n+" is "+smallest);

		sc.close();
	}

}
