import  java.util.Scanner;
import java.util.Arrays;
public class Level2q7{
	public boolean canStudentVote(int age){
		if (age>=18){
			return true;
		}
		else{
			return false;
		}
	}
		
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] age=new int[10];
		String[] result= new String[10];
		for(int i=0;i<10;i++){
			System.out.println("Enter the age of the student "+(i+1));
			age[i]=input.nextInt();
			Level2q7 obj= new Level2q7();
			boolean vote=obj.canStudentVote(age[i]);
			if (vote==true){
				result[i]="Yes";
			}
			else{
				result[i]="No";
			}
		}
		System.out.println("Tne given array of age values is here "+(Arrays.toString(age)));
		System.out.println("The given array of vote eligibility is here "+(Arrays.toString(result)));
	}
}
		
		