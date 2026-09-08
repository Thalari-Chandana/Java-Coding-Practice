import java.util.Scanner;
public class PosOrNeg{
    static void checkPosOrNeg(int n){
        if(n>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        checkPosOrNeg(sc.nextInt());
        sc.close();
    }
}