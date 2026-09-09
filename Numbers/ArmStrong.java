import java.util.Scanner;
public class ArmStrong {
    static int arm(int n){
        int temp=n;
        int original=n;
        int digit=0;
        int sum=0;
        int count=0;

        while(temp>0){
            count ++;
            temp=temp/10;
        }

        while(n>0){
            digit=n%10;
            sum=sum+(int)Math.pow(digit,count);
            n=n/10;
        }
        if(original==sum){
           return 1;
        }else{
            return 0;
        }
       
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(arm(n)==1){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
        sc.close();
    }
       
}
