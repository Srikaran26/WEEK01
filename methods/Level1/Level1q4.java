import java.util.Scanner;

public class Level1q4{
	public static double Laps(double s1,double s2,double s3){
		double distance=5*1000;
		double perimeter= s1+s2+s3;
		double laps= Math.ceil(distance/perimeter);
		return laps;
		
	}
	
	public static void main(String[] args){
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the side one distance in meters");
		double s1=scanner.nextDouble();
		System.out.println("Enter the side two distance in meters");
		double s2=scanner.nextDouble();
		System.out.println("Enter the side three distance in meters");
		double s3=scanner.nextDouble();
		double result=Laps(s1,s2,s3);
		
		System.out.println("The athelete Should run "+result+" rounds" );
	}
}

