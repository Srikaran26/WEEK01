import java.util.Scanner;
import java.util.Arrays;
public class Level2q10{
	public static String[] BMI_Status(double[][] bmivalue){
		String[] Status= new String[10];
		for (int i=0;i<10;i++){
		if (bmivalue[i][2]<=18.4){
				Status[i]="Underweight";
			}
			else if(bmivalue[i][2]>=18.5 && bmivalue[i][2]<=24.9){
				Status[i]="Normal";
			}
			else if(bmivalue[i][2]>=25.0 && bmivalue[i][2]<=39.9){
				Status[i]="Overweight";
			}
			else{
				Status[i]="Obese";
			}
		}
		return Status;
	}
		
	public static double BMIcalc(double weight,double height){
			double BMI_calc=(weight/(height*height))*10000;
			return BMI_calc;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double[][] BMI= new double[10][3];
		for (int i=0;i<10;i++){
			System.out.println("Enter the weight in kg:");
			BMI[i][0]=input.nextDouble();
			System.out.println("Enter the Height in m:");
			BMI[i][1]=input.nextDouble();
			BMI[i][2]=Level2q10.BMIcalc(BMI[i][0],BMI[i][1]);
		}
		String[] Status=Level2q10.BMI_Status(BMI);
		System.out.println("The Status of BMI values are"+(Arrays.toString(Status)));
	}
}