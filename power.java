import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        int total=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");//5
        int num = sc.nextInt();
        System.out.println("Enter the power");//3
        int pow = sc.nextInt();
        for(int i=1;i<=pow;i++)
        {
            pow =  (num*num);
            total = (pow * num);
        }
        System.out.println("The total is "+total);
    }
}
