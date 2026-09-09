

import java.util.Scanner;

class ArmStrong {
	static int checkArm(int n) {
		int temp=n;
		int sum=0;
		int count=0;
		int original=n;
		while(temp>0) {
			count ++;
			temp=temp/10;
		}
		while(n>0) {
			int digit=n%10;
			sum=sum+(int)Math.pow(digit, count);
			n=n/10;
		}
		if(sum==original)
			return 1;
		else
			return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(checkArm(n)==1) System.out.println("ArmStrong");
		else System.out.println("Not ArmStrong");
		sc.close();
	}

}

