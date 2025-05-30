import java.util.*;
public class even_odd_count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();    
        int temp = n ;                              
        int sumEven = 0;
        int sumOdd = 0;
        while(temp != 0){
        int digit = temp%10;
         if(digit%2 == 0){
                 sumEven = sumEven+digit;
                }
            else {
                sumOdd = sumOdd+digit;
                
            }
                        temp = temp/10;
            }
        System.out.println("The sum of even number is: " + sumEven );
        System.out.println("The sum of odd number is: " + sumOdd );
        sc.close();



    }
    
}