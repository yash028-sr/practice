import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        int sum,sub,prod,div,mod;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number");
        int n2 = sc.nextInt();
        System.out.println("Enter Operation");
        char opr = sc.next().charAt(0);
        switch (opr) {
            case '+':
            sum = n1+n2;
            System.out.println("The sum is "+sum);
                break;
            case '-':
            sub = n1-n2;
            System.out.println("The subtraction is "+sub);
                break;
            case '*':
            prod = n1*n2;
            System.out.println("The product is "+prod);
                break;    
            case '/':
            div = n1/n2;
            System.out.println("The divison is "+div);
                 break;
            case '%':
             mod = n1%n2;
             System.out.println("The mod is "+mod);
                 break;
            default:
            System.out.println("Enter a valid Operation");
                break;
        }
    }
}