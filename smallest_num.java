import java.util.*;
public class smallest_num { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int temp = n;
        int s =  9;
        while(temp != 0){
            int digit = temp%10;
            if(digit<=s ){
                s = digit;
            }
            temp = temp/10;
        }
        System.out.print(s);
        sc.close();


    }
}