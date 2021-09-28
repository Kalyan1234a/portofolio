/**
 * greatest Among 3 numbers
 */
public class Greatest_3 {

    public static void main(String[] args) {
        int first=2;
        int second=13;
        int third=5;
        if (first > second) {
            if (first>third) 
            {
              System.out.println(first+" is Greatest.");
            }
            else
            {
                System.out.println(third+" is Greatest.");

            }
        }
        else
        {
            if (second>third) {
                System.out.println(second+" is Greatest.");
                
            } else {
                System.out.println(third+" is Greatest.");
                
            }
        }

    }
}