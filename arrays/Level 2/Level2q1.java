import java.util.Scanner;
public class Level2q1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double[][] yearandoldsalary=new double[2][10];
		double[] newsalary=new double[10];
		int i=0;
		while(i<10){
			System.out.println("Enter the No of years :");
			double years=input.nextDouble();
			System.out.println("Enter the Salary :");
			double salary=input.nextDouble();
			if (years<0 || salary<0){
				System.out.println("Invalid Number");
			}
			else{
				yearandoldsalary[0][i]=years;
				yearandoldsalary[1][i]=salary;
				i++;
			}
		}
		for (int j=0;j<10;j++){
			if (yearandoldsalary[0][j]>5){
				double bonus=yearandoldsalary[1][j]*0.05;
				newsalary[j]=yearandoldsalary[1][j]+bonus;
				System.out.println("Employee"+(j+1)+"bonus :"+bonus+" oldsalary:"+(yearandoldsalary[1][j])+" newsalary:"+newsalary[j]);
			}
			else{
				double bonus=yearandoldsalary[1][j]*0.02;
				newsalary[j]=yearandoldsalary[1][j]+bonus;
				System.out.println("Employee"+(j+1)+"bonus :"+bonus+" oldsalary:"+(yearandoldsalary[1][j])+" newsalary:"+newsalary[j]);
			}
		}
	}
}
		