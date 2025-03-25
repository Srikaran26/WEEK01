import java.util.Scanner;
public class Level2q5{
	public static double convertyardstofeet(double yards){
		double yards2feet = 3;
		return yards*yards2feet;
	}
	
	public static double convertfeettoyards(double feet){
		double feet2yards = 0.333333;
		return feet2yards*feet;
	}
	
	public static double convertmeterstoinches(double meters){
		double meters2inches = 39.3701;
		return meters2inches*meters;
	}
	
	public static double convertinchestometers(double inches){
		double inches2meters = 0.0254;
		return inches2meters*inches;
	}
	
	public static double convertinchestocm(double inches){
		double inches2cm = 2.54;
		return inches2cm*inches;
	}

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the Distance in yards :");
		double yards=input.nextDouble();
		double yards2feet=Level2q5.convertyardstofeet(yards);
		System.out.println("yards to feet is "+yards2feet);
		
		System.out.println("Enter the Distance in feet :");
		double feet=input.nextDouble();
		double feet2yards=Level2q5.convertfeettoyards(feet);
		System.out.println("feet to yards is "+feet2yards);
		
		System.out.println("Enter the Distance in meters :");
		double meters=input.nextDouble();
		double meters2inches=Level2q5.convertmeterstoinches(meters);
		System.out.println("meters to inches is "+meters2inches);
		
		
		System.out.println("Enter the Distance in inches :");
		double inches=input.nextDouble();
		double inches2meters=Level2q5.convertinchestometers(inches);
		System.out.println("inches to meters is "+inches2meters);
		
		System.out.println("Enter the Distance in inches :");
		double inches1=input.nextDouble();
		double inches2cm=Level2q5.convertinchestocm(inches1);
		System.out.println("inches to cm is "+inches2cm);
	}
}