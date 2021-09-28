import java.util.Scanner;
public class Sum_of_n {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Enter Number for sum: ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
