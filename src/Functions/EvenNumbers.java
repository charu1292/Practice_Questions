package Functions;

import java.util.Scanner;

public class EvenNumbers {
    public static boolean isEven(int n){
        if(n%2==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("please enter your number :");
        int n=sc.nextInt();

        System.out.println(isEven(n));



    }
}
