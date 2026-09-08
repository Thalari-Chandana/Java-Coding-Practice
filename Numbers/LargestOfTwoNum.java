import java.util.Scanner;
public class LargestOfTwoNum{
    static void checkLarOfTwoNum(int a,int b){
        if(a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("b is greater");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        checkLarOfTwoNum(sc.nextInt(),sc.nextInt());
        sc.close();
    }
}