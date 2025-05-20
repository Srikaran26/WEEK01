import java.util.Scanner;

public class Level1q9{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		if(num<=0){
			System.out.println("Enter positive number");
			scanner.close();
		}
		String[] array= new String[num+1];
		for(int i=0;i<=num;i++){
		    if(i%3==0 && i%5==0){
				array[i]= "FizzBuzz";
			}else if(i%3==0){
				array[i]= "Fizz";
			}else if(i%5==0){
				array[i]= "Buzz";
			}else{
				array[i]= String.valueOf(i);
			}
		}
		System.out.println("FizzBuzz Results:");
		for(int i=0;i<=num;i++){
			System.out.println("Position " + i + " = " + array[i]);
		}
		scanner.close();
	}
}