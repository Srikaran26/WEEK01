import java.util.Scanner;
public class Level1q9{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int index=0;
		System.out.println("Enter number of rows");
		int rows=scanner.nextInt();
		
		System.out.println("Enter number of columns");
		int columns=scanner.nextInt();
		int[][] matrix=new int[rows][columns];
		int[] array=new int[rows*columns];
		
		System.out.println("Enter the 2D array elements");
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				matrix[i][j]=scanner.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				array[index]=matrix[i][j];
				index+=1;
			}
		}
		System.out.println("1D array elements are: ");
		for(int i=0;i<index;i++){
			System.out.println(array[i]+" ");
		}
		scanner.close();
	}
}