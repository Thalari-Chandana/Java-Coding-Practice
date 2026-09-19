
class FirstHalf {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int sum=0;
		int firstHalf=a.length/2;
		for(int i=0;i<=firstHalf;i++) {
			sum =sum+a[i];
		}
		System.out.println("Average of first half="+(sum/firstHalf));
	}

}
