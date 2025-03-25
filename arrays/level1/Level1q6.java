import java.util.Scanner;

public class Level1q6{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		double[] arr=new double[11];
		double sum=0.0;
		
		System.out.println("Enter the heights of players: ");
		
		for(int i=0;i<arr.length;i++){
			
			arr[i]= scanner.nextDouble();
			sum=sum+arr[i];
		}
		
		double mean=sum/11;
		
		System.out.printf("Mean of heights: %.2f",mean);
	}
}