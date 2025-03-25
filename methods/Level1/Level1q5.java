import java.util.Scanner;

public class Level1q5{
	
	public static int Inttype(int n){
		
		if(n>0){
			return 1;
		}else if(n<0){
			return -1;
			
		}else {
			return 0;
		}
	}
	
	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		int result = Inttype(n);
        
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
		scanner.close();
	}
}