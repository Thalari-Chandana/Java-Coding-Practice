import java.util.Scanner;
public class Prime{
    static int count=0;
    static int checkPrime(int n){      
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        checkPrime(sc.nextInt());
        if(count==2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
        sc.close();

    }
}