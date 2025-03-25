package day2.level1;

import java.util.Scanner;

public class positive6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number");
        int n1=scanner.nextInt();

        if(n1>0){
            System.out.println(n1+" is a positive integer");
        } else if (n1<0) {
            System.out.println(n1+" is a negative integer");
        } else if(n1==0){
            System.out.println("zero");
        }

    }
}
