import java.util.Scanner;
public class Level2q6{
	public static double convertfarhenheittocelsius(double farhenheit){
		double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
		return farhenheit2celsius;
	}
	
	public static double convertcelsiustofarhenheit(double celsius){
		double celsius2farhenheit = (celsius * 9 / 5) + 32;
		return celsius2farhenheit;
	}
	
	public static double convertpoundstokilograms(double pounds){
		double pounds2kilograms = 0.453592;
		return pounds2kilograms*pounds;
	}
	
	public static double convertkilogramstopounds(double kilograms){
		double kilograms2pounds = 2.20462;
		return kilograms2pounds*kilograms;
	}
	
	public static double convertgallonstoliters(double gallons){
		double gallons2liters = 3.78541; 
		return gallons*gallons2liters;
	}
	
	public static double convertliterstogallons(double liters){
		double liters2gallons = 0.264172; 
		return liters2gallons*liters;
	}

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the Value in farhenheit :");
		double farhenheit=input.nextDouble();
		double farhenheit2celsius=Level2q6.convertfarhenheittocelsius(farhenheit);
		System.out.println("farhenheit to celsius is "+farhenheit2celsius);
		
		System.out.println("Enter the Value in celsius :");
		double celsius=input.nextDouble();
		double celsius2farhenheit=Level2q6.convertcelsiustofarhenheit(celsius);
		System.out.println("celsius to farhenheit is "+celsius2farhenheit);
		
		System.out.println("Enter the Weight in pounds :");
		double pounds=input.nextDouble();
		double pounds2kilograms=Level2q6.convertpoundstokilograms(pounds);
		System.out.println("pounds to kilograms is "+pounds2kilograms);
		
		
		System.out.println("Enter the Weight in kilograms :");
		double kilograms=input.nextDouble();
		double kilograms2pounds=Level2q6.convertkilogramstopounds(kilograms);
		System.out.println("kilograms to pounds is "+kilograms2pounds);
		
		System.out.println("Enter the quantity in gallons :");
		double gallons=input.nextDouble();
		double gallons2liters=Level2q6.convertgallonstoliters(gallons);
		System.out.println("gallons to liters is "+gallons2liters);
		
		System.out.println("Enter the quantuty in liters :");
		double liters=input.nextDouble();
		double liters2gallons=Level2q6.convertliterstogallons(liters);
		System.out.println("liters to gallons is "+liters2gallons);
	}
}