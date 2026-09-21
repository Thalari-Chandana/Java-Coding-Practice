import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesArray {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,20,90,90,20};
		int rem=a[0];
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[i]=-1;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=-1)
				System.out.print(a[i]+" ");
		}
		
    }
}