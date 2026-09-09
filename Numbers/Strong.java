import java.util.Scanner;
class Strong {
	static int checkStrong(int n) {
		int sum=0;
		int temp=n;
		while(n>0) {
			int digit=n%10;
			int fact=1;
			for(int i=1;i<=digit;i++) {
				fact *=i;
			}
			sum +=fact;
			n=n/10;
		}
		if(sum==temp) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		if(checkStrong(n)==1) System.out.println(n+" is ArmStrong Number");
		else System.out.println(n+" is Not an ArmStrong number");
		sc.close();
		
	}

}
