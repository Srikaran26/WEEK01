import java.util.Scanner;
public class Level2q8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int i=1;
		if (num<0){
			System.out.println("Not positive number");
		}
		else{
		while(i<=num){
			if (num%i==0){
				System.out.println(i);
			}
			i++;
		}
		}
	}
}