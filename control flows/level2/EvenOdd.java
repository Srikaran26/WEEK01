import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		for (int i=1;i<=num;i++){
			if (i%2==0){
			System.out.println(i+"is a even number");
			}
			else{
				System.out.println(i+"is a odd number");
			}
		}
	}
}
		