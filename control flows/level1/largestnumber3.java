package day2.level1;

import java.util.Scanner;

public class largestnumber3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("First Number");
        double n1=scanner.nextDouble();
        System.out.println("Second Number");
        double n2=scanner.nextDouble();
        System.out.println("Third Number");
        double n3=scanner.nextDouble();

        if(n1>n2 && n1>n3){
            System.out.println("First number is largest");
        }
        if(n2>n1 && n2>n3){
            System.out.println("second number is largest");
        }
        if(n3>n1 && n3>n2){
            System.out.println("third number is largest");
        }

    }
}
