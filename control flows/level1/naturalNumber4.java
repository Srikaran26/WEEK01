package day2.level1;

import java.util.Scanner;

public class naturalNumber4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=scanner.nextInt();

        if(n<1){
            System.out.println(n +" is not a natural number");
        } else{
            System.out.println(n +" is a natural number");

            int sum= n*(n+1)/2;
            System.out.println("Sum of "+n+" natural numbers is "+sum);
        }
    }
}
