import java.util.Scanner;

public class Level1q12{
	public double[] calculateTrigonometricFunctions(double angle){
		double radians=Math.toRadians(angle);
		
		double sine=Math.sin(radians);
		double cosine=Math.cos(radians);
		double tangent=Math.tan(radians);
		
		return new double[]{sine,cosine,tangent};
	}
	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter anle in degrees: ");
		double angle=scanner.nextDouble();
		Level1q12 obj = new Level1q12();
		double[] result=obj.calculateTrigonometricFunctions(angle);
		System.out.printf("sine value is: %.2f \n",result[0]);
		System.out.printf("cosine value is: %.2f \n",result[1]);
		System.out.printf("tangent value is: %.2f \n",result[2]);
		
		scanner.close();
		
	}
}