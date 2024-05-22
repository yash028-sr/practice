import java.util.Scanner;
class chefproblem {
    public static void main(String[] args)
    {
        int total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stoves");
        int stoves = sc.nextInt();
        System.out.println("Enter the number of minutes");
        int minutes = sc.nextInt();
        total = (stoves * minutes);
        System.out.println("The maximum number of customers chef can serve in Y minutes are : "+total);
    }
} 
  
