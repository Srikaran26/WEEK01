package day2.level1;

import java.util.Scanner;

public class firstsmallest2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double n1=scanner.nextDouble();
        double n2=scanner.nextDouble();
        double n3=scanner.nextDouble();

        if(n1<n2 && n1<n3){
            System.out.println("First number is smallest");
        } else{
            System.out.println("First number is not smallest");
        }
    }
}
