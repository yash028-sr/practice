//Take a number nfrom user, print sum of first n natural numbers.If user enters a negative number then show error

import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num<0) {
            System.out.println("Enter number is Invalid");
            return ;
        }
        sum=(num*(num+1))/2;
        System.out.println("The sum of natural numbers till entered number is : "+sum);

        }
    }

