import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
public class Level2q11{
	public static double[] quadratic(int a,int b, int c){
		double delta=(double) Math.pow(b,2)-4*a*c;
		if (delta>0){
			double[] roots=new double[2];
			roots[0]=(-b+Math.sqrt(delta))/(2*a); 
			roots[1]=(-b-Math.sqrt(delta))/(2*a);
			return roots;
		}
		else if (delta==0){
			double[] roots=new double[1];
			roots[0]=-b/(2*a);
			return roots;
		}
		else{
			return new double[0];
		}
	}
			
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the coefficient of 'x2' of the quadratic equation :");
		int a=input.nextInt();
		System.out.println("Enter the coefficient of 'x' of the quadratic equation :");
		int b=input.nextInt();
		System.out.println("Enter the constant value of the quadratic equation :");
		int c=input.nextInt();
		double[] result=Level2q11.quadratic(a,b,c);
		System.out.println("Roots of the equation are :"+(Arrays.toString(result)));
	}
}