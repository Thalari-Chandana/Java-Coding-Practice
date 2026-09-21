public class RemoveAllOccu {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,20,90,0,20};
		int target=20;
		for(int i=0;i<a.length;i++) {
			if(a[i]==target) {
					a[i]=-1;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=-1) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
