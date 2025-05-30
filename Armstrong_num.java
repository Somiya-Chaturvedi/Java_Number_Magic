import java.util.*;
public class Armstrong_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        while(temp!=0){
            count++;
            temp = temp/10;
        }
        int sum = 0;
          temp = n;
          while(temp!=0)
          {
            int digit = temp%10;
          sum += Math.pow(digit, count);
          temp = temp/10;
         }
         if (sum ==n){
            System.out.println("The number is armstrong: " + n);
         }
         else{

             System.out.println( n + " The number is not a armstrong: ");
         }
         sc.close();

         
    }
}