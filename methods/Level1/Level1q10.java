import java.util.Scanner;
public class Level1q9{
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int remainder=number%divisor;
		int quotient=number/divisor;
		
		return new int[]{remainder,quotient};
	}
	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of chocolates: ");
		int n1=scanner.nextInt();
		System.out.println("Enter children: ");
		int n2=scanner.nextInt();
		
		int[] result=findRemainderAndQuotient(n1,n2);
		System.out.println("Each child get "+result[1]+" chocolates");
		System.out.println("Remaining chocolates are: "+result[0]);
		scanner.close();
		
	}
}