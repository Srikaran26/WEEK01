package day2.level1;

import java.util.Scanner;

public class divisibility1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double n=scanner.nextDouble();
        if(n%5==0){
            System.out.println(n+ " is divisible by 5");
        } else{
            System.out.println(n+ " is not divisible by 5");
        }

    }
}
