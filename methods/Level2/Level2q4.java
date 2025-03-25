import java.util.Scanner;
public class Level2q4{
	public static double convertkmtomiles(double km){
		double km2miles=0.621371;
		return km*km2miles;
	}
	
	public static double convertmilestokm(double miles){
		double miles2km = 1.60934;
		return miles2km*miles;
	}
	
	public static double convertmeterstofeet(double meters){
		double meters2feet = 3.28084;
		return meters2feet*meters;
	}
	
	public static double convertfeettometers(double feet){
		double feet2meters = 0.3048;
		return feet2meters*feet;
	}

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the Distance in km :");
		double km=input.nextDouble();
		double km2miles=Level2q4.convertkmtomiles(km);
		System.out.println("km to miles is "+km2miles);
		
		System.out.println("Enter the Distance in miles :");
		double miles=input.nextDouble();
		double miles2km=Level2q4.convertmilestokm(miles);
		System.out.println("miles to km is "+miles2km);
		
		System.out.println("Enter the Distance in meters :");
		double meters=input.nextDouble();
		double meters2feet=Level2q4.convertmeterstofeet(meters);
		System.out.println("meters to feet is "+meters2feet);
		
		
		System.out.println("Enter the Distance in feet :");
		double feet=input.nextDouble();
		double feet2meters=Level2q4.convertfeettometers(feet);
		System.out.println("feet to meters is "+feet2meters);
	}
}
		