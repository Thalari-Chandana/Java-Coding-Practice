

import java.util.Scanner;

class SwapTwoNum {
	static void checkSwapTwo(int a,int b) {
		System.out.println("Before swaping");
		System.out.println("a: "+a+" b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping");
		System.out.println("a: "+a+" b:"+b);
		
	}public static void main(String[] args) {
		System.out.println("enter a value and b value");
		Scanner sc = new Scanner(System.in);
		checkSwapTwo(sc.nextInt(),sc.nextInt());
		sc.close();
	}


}
