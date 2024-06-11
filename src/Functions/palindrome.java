package Functions;

import java.util.Scanner;

public class palindrome {
    public static int reverse(int n) {
            int reverseNumber=0;
            while (n > 0) {
                int lastDigit = n % 10;
                n=n/10;
                reverseNumber = (reverseNumber * 10) + lastDigit;
            }
        return reverseNumber;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your number :");
        int n=sc.nextInt();
        int reverseNumber= reverse(n);
        if(reverseNumber==n)
        System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");



    }


}
