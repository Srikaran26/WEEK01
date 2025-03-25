import java.util.Scanner;

public class Level1q1{
	
		
	static void Si(double p,double r,double t){
		
		double SI=(p*r*t)/100;
		System.out.println("Simple interest amount is: "+ SI);
		return;
	}
	

	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter principle amount: ");
		double p=scanner.nextDouble();
		
		System.out.println("Enter rate of interest: ");
		double r=scanner.nextDouble();
		
		System.out.println("Enter time period: ");
		double t=scanner.nextDouble();
		
		
		Si(p,r,t);
		scanner.close();
	}
}