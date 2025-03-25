import java.util.Scanner;
public class Level2q7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if (num<0){
			System.out.println("Not positive number");
		}
		else{
			for (int i=1;i<=num;i++){
				if(num%i==0){
					System.out.println(i);
				}
			}
		}
	}
}