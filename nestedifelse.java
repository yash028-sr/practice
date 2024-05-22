import java.util.Scanner;

public class nestedifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entered any number to check");
        int num = sc.nextInt();
        if (num>0) {
            if (num%2==0) {
            System.out.println("Entered number is an Positive even");
            }
            else
            {
                System.out.println("Entered number is an Positive Odd");
            }

        }
        else if(num<0){
            if (num%2==0) {
              System.out.println("Entered number is an Negative even");
             }
                else
                {
                    System.out.println("Entered number is an Negative Odd");
                }
        }
        else
        {
            System.out.println("Entered number is Zero");
        }
    }
}
