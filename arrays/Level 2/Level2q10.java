import java.util.Scanner;

public class Level2q10{
	public static void main(String[] args){
		
		Scanner sccanner= new Scanner(System.in);
		int arr[]=new int[10];
		int digit;
		System.out.println("Enter a number: ");
		int n=scanner.nextInt();
		
		
		while(n>0){
			digit= n%10;
			arr[digit]++;
			n/=10;
		}
		
		System.out.println("Digits Frequency");
		for(int i=0;i<10;i++){
			if(arr[i]>0){
				System.out.println("The frequency of digit "+i+" is "+arr[i]);
			}
		}		
		
	}
}