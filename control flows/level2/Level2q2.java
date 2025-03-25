import java.util.Scanner;
public class Level2q2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int salary=input.nextInt();
		int serviceofyears=input.nextInt();
		if (serviceofyears>5){
			System.out.println(salary+salary*0.05);
		}
	}
}