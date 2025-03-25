import java.util.Scanner;
class multiplication18 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scanner.nextInt();
        if(n>=6 && n<=9){
            for(int i =1;i<=10;i++){
                System.out.println(n+"*"+i+"="+n*i);
            }
        }else{
            System.out.println("Enter a number between 6 and 9");
        }
    }
}