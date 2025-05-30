import java.util.*;
public class reverse_num
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num ; 
        int rev = 0;
        int count = 0;
        int sum = 0;
        while(temp!= 0)
        {
            int digit = temp%10;
            sum = sum+digit;
            rev = rev*10+digit;
            temp = temp/10;
            count++;
            
           
        }
        System.out.println("The reverse is: " + rev);
        System.out.println("The count of number is: " + count);
        System.out.println("The sum of number is: " + sum);
        if(num == rev && num>9){
            System.out.println("The given number is palindrome");
        }
        else{
            System.out.println("THe given number is not a palindrome");
        }
        sc.close();
    }
}