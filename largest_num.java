import java.util.*;
public class largest_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n =  sc.nextInt();
        int temp = n;
        int maxDigit = 0;
         while(temp != 0){
            int digit = temp%10;
            if(digit >= maxDigit){
                 maxDigit = digit;

            }
            temp = temp/10;
        }
        System.out.print(maxDigit);
           
        
        sc.close();
        }
    
}
