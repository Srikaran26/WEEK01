import java.util.Scanner;

public class Level1q1{
	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int[] ages=new int[10];
		System.out.println("Enter the age of 10 students");
		for(int i=0;i<ages.length;i++){
			ages[i]= scanner.nextInt();
		}
		for(int i=0;i<ages.length;i++){
			if(ages[i]>=18){
				System.out.println(ages[i]+" years student can vote");
			} else if(ages[i]>0 && ages[i]<18){
				System.out.println(ages[i]+" years student can't vote");
			}else{
				System.out.println(ages[i]+" is an Invalid age");
			}
		}
	}
}