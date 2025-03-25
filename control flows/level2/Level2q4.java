import java.util.Scanner;
public class Level2q4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if (num<0){
			System.out.println("Not positive number");
		}
		else{
			for (int i=1;i<=num;i++){
				if (i%15==0){
					System.out.println("FizzBuzz");
				}
				else if (i%5==0){
					System.out.println("Buzz");
				}
				else if (i%3==0){
					System.out.println("Fizz");
				}
				else{
					System.out.println(i);
				}
			}
		}
	}
}