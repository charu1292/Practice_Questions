package Functions;

import java.util.Scanner;

public class SumOFdigits {
    public static int sumOfNumber(int n){
        int sum=0;
        while (n > 0) {
            int lastDigit = n % 10; //retrieve last digit
            n=n/10;              // delete last digit
            sum += lastDigit;  //we can write this sum=sum+lastdigit
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your number :");
        int n=sc.nextInt();
        System.out.println(sumOfNumber(n));

    }
}
