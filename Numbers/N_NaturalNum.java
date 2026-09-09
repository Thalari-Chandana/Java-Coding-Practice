
import java.util.Scanner;
class N_NaturalNum {
	static void naturalNumbers(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		naturalNumbers(sc.nextInt());
		sc.close();
		
	}

}

