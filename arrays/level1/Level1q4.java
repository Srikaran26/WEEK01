import java.util.Scanner;

public class Level1q1{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		double[] arr=new double[10];
		double total=0.0;
		int index=0;
		
		while(true){
			System.out.println("Enter a number: ");
			double input=scanner.nextDouble();
			
			if(input<=0){
				break;
			}
			if(index==10){
				System.out.println("array is full ");
				break;
			}
			arr[index]=input;
			index++;
		}
		System.out.println("Entered numbers are: ");
		for(int i=0;i<index;i++){
			System.out.println(a[i]);
			total=total+arr[i];
			
		}
		System.out.println("Total sum: "+total);
		scanner.close;
	}
}