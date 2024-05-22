import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int prod=1,fact=1;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    System.out.println("The number Entered by user is : "+num);  
    for(int i=1;i<=num;i++) // num=5
    {
      prod= (i*1);// 1
      fact = (prod*fact); //1
    }
    System.out.println("The factorial of entered number is "+fact);
    this.dispose()
}
}