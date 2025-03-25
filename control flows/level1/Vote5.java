package day2.level1;

import java.util.Scanner;

public class Vote5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age=scanner.nextInt();

        if(age>=18){
            System.out.println("Eligible for vote");
        } else{
            System.out.println("Not Eligible for vote");
        }
    }
}
