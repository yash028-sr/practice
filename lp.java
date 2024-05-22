import java.util.Scanner;
public class lp {
    public static void main(String[] args) {
        int sum;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store");
        int num = sc.nextInt(); 
        System.out.println("Enter the target value");
        int tar = sc.nextInt(); 
        int nums[] = new int[5];  
        System.out.println("Enter the elements in array");
        for(int i=0;i<num;i++)
        {
            nums[i]=sc.nextInt();
        }
      for(int i=0;i<=4;i++)
      {
      for(int j=i+1;i<=4;i++)
      {
       sum = (nums[i] + nums[j]);
        if(sum == tar)
         {
            System.out.println("Target value found at indexes"+nums[i]+nums[j]);
         }
        else 
        {
            
        }
      }

    }
    
}
}
