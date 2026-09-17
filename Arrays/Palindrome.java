

public class Palindrome {
	public static void main(String[] args) {
		int[] a= {1,2,3,2,1};
		int start=0;
		int end=a.length-1;
		while(start<end) {
			if(a[start]!=a[end]) {
				System.out.println("Not palindrome");
				return;
			}
			start ++;
			end --;
			}
		System.out.println("palindrome");
		
	}

}
