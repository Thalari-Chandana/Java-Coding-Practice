class Count{
    public static void main(String[] args){
        int countdigits=0;
        int letters=0;
        int specialChar=0;
        String s="abc123@#";
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='0' && ch[i]<='9'){
                countdigits++;
            }
            else if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z')){
                letters++;
            }
            else{
                specialChar++;
            }
        }
        System.out.println("Digits: "+countdigits);
        System.out.println("Letters: "+letters);
        System.out.println("Special Characters: "+specialChar);
    }
}