import java.util.Scanner;
public class Level2q2{
	public static int sumofnnum(int num){
		if (num==0){
			return 0;
		}
		else{
			return num+sumofnnum(num-1);
		}
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=input.nextInt();
		if (num<1){
			System.out.println("Not a natural number");
			System.exit(0);
		}
		else{
			System.out.println("The sum of n numbers through recursion is "+Level2q2.sumofnnum(num));
		}
		System.out.println("The sum of n numbers through formula for cross check is "+((num*(num+1))/2));
	}
		}