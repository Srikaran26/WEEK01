import java.util.Scanner;

public class Level1q2{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int[] arr=new int[5];
		
		for(int i=0;i<arr.length;i++){
			
			arr[i]=scanner.nextInt(); 
		}
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]>=0){
				System.out.println(arr[i]+" is a positive integer");
			} else if(arr[i]<0){
				System.out.println(arr[i]+" is a negative integer");
			}
			if(arr[i]%2==0){
				System.out.println(arr[i]+" is a even integer");
			} else if(arr[i]%2!=0){
				System.out.println(arr[i]+" is a odd integer");
			}
		}
		if(arr[0]==arr[4]){
			System.out.println("first and last elements are equal");
		}else if(arr[0]>arr[4]){
			System.out.println("first element is greater than last element");
		}else{
			System.out.println("first element is less than last element");
		}
	}
	
}