import java.util.Scanner;

public class naturalno {
    public static void main(String[] args) {
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        sum = (num*(num+1))/2;
        System.out.println("The sum of natural number is : "+sum); 
    }
    
}
