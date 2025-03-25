import java.util.Scanner;
public class Level2q11{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if (num<0 || num>100){
			System.out.println("Not positive number or number range exceeds");
		}
		else{
			for (int i=100;i>=num;i--){
				if (i%num==0){
					System.out.println(i);
				}
			}
		}
	}
}
			