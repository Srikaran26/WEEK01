package java03;

import java.util.Scanner;

public class Temp4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double cel=scanner.nextDouble();
        double fah= (cel*9.0/5)+32;

        System.out.println(fah);
    }
}
