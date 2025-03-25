import java.util.Scanner;
public class Level2q5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if (num<0){
			System.out.println("Not positive number");
		}
		else{
			int i=1;
			while (i<=num){
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
				i++;
			}
		}
	}
}