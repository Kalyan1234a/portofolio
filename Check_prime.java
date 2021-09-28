import java.util.Scanner;
public class Check_prime {
    public static void main(String[] args) {
        int n,m,temp=0;

        System.out.println("Enter number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=n/2;
        if (n==0||n==1) {
            System.out.println(n + " is not a prime Number.");
        } else {
            for (int i = 2; i < m; i++) {
                if (n%i==0) 
                {
                     System.out.println(n + " is not a prime Number.");
                     temp=1;
                     break;
                }
            }
            if(temp==0)  
            {
                 System.out.println(n+" is prime number"); 
            }
        }
    }
}
