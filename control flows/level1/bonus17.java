import java.util.Scanner;
class bonus17 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter Salary: ");
        double sal=scanner.nextDouble();
        System.out.print("Enter Year of service: ");
        double yos=scanner.nextDouble();
        double bonus=0;
        if(yos>5){
            bonus= 5.0/100*sal;
        }
        System.out.print("The bonus amount is "+bonus);
    }
}