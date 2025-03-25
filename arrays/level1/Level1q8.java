import java.util.Scanner;

public class Level1q8{
	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[10];
		int facind=0;
		int maxFactor=10;
		if(n<=0){
			System.out.println("Please enter a positive number");
			return;
		}
		
		for(int i=1;i<=n;i++){
			if(n%i==0){
				if(facind==maxFactor){
					maxFactor*=2;
					int[] temp= new int[maxFactor];
					System.arraycopy(arr,0,temp,0,arr.length);
					arr=temp;
				}
				arr[facind]=i;
				facind+=1;
			}
		}
		System.out.println("Factors are");
		for(int i=0;i<facind;i++){
			System.out.println(arr[i]);
		}
		
		
	}
}