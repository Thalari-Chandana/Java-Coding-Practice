class ReverseString {
	public static void main(String[] args) {


		String s="ABc";
		char[] ch=s.toCharArray();
		String rev="";	//"CBA";
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];

		}
		System.out.println(rev);
	}
}
