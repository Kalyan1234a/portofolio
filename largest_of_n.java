import java.util.Scanner;

public class largest_of_n {
    public static void main(String[] args) {
        int large,n;
        int []a=new int[20];
        System.out.println("Enter count of numbers you want to enter: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i+1) + ": ");
            a[i]=sc.nextInt();
        }
        large=a[0];
        for (int i = 1; i < n; i++) {
           if (large<=a[i]) 
           {
               large=a[i];
           } 
        }
        System.out.println(large);
    }
}
