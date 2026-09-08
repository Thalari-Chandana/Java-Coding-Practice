import java.util.Scanner;
public class EvenOrOdd{
    static void checkEvenOrOdd(int n){
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            checkEvenOrOdd(sc.nextInt());
        }
    }
}