import java.util.Scanner;
public class Digit_count {
    public static void main(String[] args) {
        int digit = 0, n;
        System.out.println("Enter number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    while (n != 0) {
      n /= 10;
      ++digit;
    }
    System.out.println("Number of digits: " + digit);
    }
}
