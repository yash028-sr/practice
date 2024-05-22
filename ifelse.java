// program to calculate no is even or odd using if else

import java.nio.file.SecureDirectoryStream;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element you want to check");
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.println("Entered number is an Even number");
        }
        else
        {
            System.out.println("Entered number is an odd number");
        }
    }
    
}
