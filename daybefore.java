import java.util.Scanner;

public class daybefore {
    public static void main(String[] args) {
        int new_day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current day");
        int current_day = sc.nextInt();
        System.out.println("Enter the how much days before current day");
        int day_before = sc.nextInt();
        new_day = (day_before%7);
        if (new_day>0) {
            System.out.println(new_day);
        }
        else
        System.out.println(new_day+7);
        }
    
}
