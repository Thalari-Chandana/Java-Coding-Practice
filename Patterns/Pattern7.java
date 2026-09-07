public class Pattern7 {
    public static void main(String[] args){
        int n=7;
        int space=n-1;
        int stars=1;
       for(int i=1;i<=n;i++){

    // 1. First print spaces
    for(int j=1;j<=space;j++){
        System.out.print("  ");
    }

    // 2. Then print stars
    for(int k=1;k<=stars;k++){
        System.out.print("*"+" ");
    }

    // 3. Only AFTER printing the row, change values
    if(i<(n/2)+1){
        space--;
        stars+=2;
    }else{
        space++;
        stars-=2;
    }

    System.out.println();
}
    }
}
