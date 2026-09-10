
import java.util.*;

//Develop a java program to swap 2 numbers.

class SwapTwo {
	static void checkSwapTwo(int a,int b) {
		System.out.println("before Swapping");
		System.out.println("a: "+a+" b:"+b);
		int temp = a;
		a=b;
		b=temp;
		System.out.println("after swaping");
		System.out.println("a: "+a+" b:"+b);
		
	}public static void main(String[] args) {
		System.out.println("enter a value and b value");
		Scanner sc = new Scanner(System.in);
		checkSwapTwo(sc.nextInt(),sc.nextInt());
		sc.close();
	}

}
