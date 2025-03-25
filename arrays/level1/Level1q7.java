import java.util.Scanner;

public class Level1q7{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		if(n<=0){
			System.err.println("Not a natural number");
			System.exit(0);
		}
		int[] even=new int[n/2+1];
		int[] odd=new int[n/2+1];
		
		int evenindex=0;
		int oddindex=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				even[evenindex]=i;
				evenindex+=1;
			}else{
				odd[oddindex]=i;
				oddindex+=1;
			}
			
		}
		System.out.println("odd numbers are: ");
		for(int i=0;i<oddindex;i++){
			System.out.println(odd[i]);
		}
		System.out.println("even numbers are: ");
		for(int i=0;i<evenindex;i++){
			System.out.println(even[i]);
		}
	}
}