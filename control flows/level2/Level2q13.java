import java.util.Scanner;
public class Level2q13{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if (num<0 || num>100){
			System.out.println("Not positive number or number range exceeds");
		}
		else{
			int i=100;
			while(i>=num){
				if (i%num==0){
					System.out.println(i);
				}
				i--;
			}
		}
	}
}