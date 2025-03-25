import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
public class Level2q12{
	public int[] generate4DigitRandomArray(int size){
		int[] randomnumbers=new int[size];
		for (int i=0;i<size;i++){
			randomnumbers[i]=1000 + (int)(Math.random() * 9000);
		}
		return randomnumbers;
	}
	public double[] findAverageMinMax(int[] numbers){
		double[] Avgminmax=new double[3];
		int sum=0;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for (int i=0;i<numbers.length;i++){
			sum=sum+numbers[i];
			min=Math.min(min,numbers[i]);
			max=Math.max(max,numbers[i]);
		}
		Avgminmax[0]=(double)sum/numbers.length;
		Avgminmax[2]=min;
		Avgminmax[1]=max;
		return Avgminmax;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Level2q12 obj= new Level2q12();
		int[] numbers=obj.generate4DigitRandomArray(5);
		double[] result= obj.findAverageMinMax(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(result));
	}
}
	
		
		
		
		
		