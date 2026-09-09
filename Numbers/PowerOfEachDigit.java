import java.util.Scanner;
public class PowerOfEachDigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the power");
        int power=sc.nextInt();
        while(n!=0){
            int digit=n%10;
            int res=1;
            for(int i=1;i<=power;i++){
                res=res*digit;
            }
            n=n/10;
            System.out.println(digit+" power is "+res);
            sc.close();
        }
    }
}