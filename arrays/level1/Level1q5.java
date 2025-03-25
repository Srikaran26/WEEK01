import java.util.Scanner;

public class Level1q5{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int[] arr=new int[10];
		
		System.out.println("Enter a number: ");
		int number=scanner.nextInt();
		if(number>=6 && number<=9){
			for(int i=1;i<=10;i++){
				arr[i-1]=number*i;
			}
			for(int i=0;i<10;i++){
				System.out.println(number+"*"+(i+1)+"="+arr[i]);
			}
				
		}else{
			System.err.println("Enter a number between 6 and 9");
			System.exit(0);
		}
		
	}
}