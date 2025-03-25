import java.util.Scanner;
public class Level2q9{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int greatestfactor=1;
		for (int i=num-1;i>=1;i--){
			if (num%i==0){
				greatestfactor=i;
				break;
			}
		}
		System.out.println(greatestfactor);
	}
}