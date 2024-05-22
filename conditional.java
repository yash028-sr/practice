import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("The value of a is : "+a);
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("The value of b is : "+b);

        if (a>b) {
         System.out.println("a is greater than b");            
        }
        else
        {
            System.out.println("b is greater than a");
        }
    }
}
