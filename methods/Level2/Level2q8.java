import java.util.Scanner;
public class Level2q8{
	public static void youngest(int[] age){
		int min=Integer.MAX_VALUE;
		int j=0;
		for (int i=0;i<3;i++){
			if (age[i]<min){
				min=age[i];
				j=i;
			}
		}
		System.out.println("Friend "+(j+1)+" is the youngest with age "+min);
		}
		public static void tallest(int[] height){
			int j=0;
		int max=Integer.MIN_VALUE;
		for (int i=0;i<3;i++){
			if (height[i]>max){
				max=height[i];
				j=i;
			}
		}
		System.out.println("Friend "+(j+1)+" is the tallest with height "+max);
		}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] age= new int[3];
		int[] height= new int[3];
		for (int i=0;i<3;i++){
			System.out.println("Enter the age of friend "+(i+1));
			age[i]=input.nextInt();
			System.out.println("Enter the height of friend "+(i+1));
			height[i]=input.nextInt();
		}
		Level2q8.youngest(age);
		Level2q8.tallest(height);
	}
}