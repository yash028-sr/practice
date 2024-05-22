import java.util.Scanner;

public class nthtermap {
    public static void main(String[] args) {
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first term of AP");
        int a = sc.nextInt();
        System.out.println("Enter the difference between each term");
        int n = sc.nextInt();
        System.out.println("Enter the No of term");
        int d = sc.nextInt();
        result = a+(n-1)*d;
        System.out.println(result);
     
    }
}
