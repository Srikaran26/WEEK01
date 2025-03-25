import java.util.Scanner;
import java.util.Arrays;
public class Level2q1{
	public static int sumoffactors(int[] arr){
		int sum=0;
		for (int num:arr){
			sum=sum+num;
		}
		return sum;
	}
	public static int prodoffactors(int[] arr){
		int prod=1;
		for (int num:arr){
			prod=prod*num;
		}
		return prod;
	}
	public static int sumofsqoffactors(int[] arr){
		int sum=0;
		for (int num:arr){
			sum=sum+(int)Math.pow(num,2);
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int count=0;
		for (int i=1;i<=num;i++){
			if (num%i==0){
				count=count+1;
			}
		}
		int[] arr=new int[count];
		int j=0;
		for (int i=1;i<=num;i++){
			if (num%i==0){
				arr[j]=i;
				j++;
			}
		}
		System.out.println("The sum of the factors are"+Arrays.toString(arr));
		System.out.println("The sum of the factors are"+Level2q1.sumoffactors(arr));
		System.out.println("The product of the factors are"+Level2q1.prodoffactors(arr));
		System.out.println("The sum of squares of the factors are"+Level2q1.sumofsqoffactors(arr));
	}
}
		
		
