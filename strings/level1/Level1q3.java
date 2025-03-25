import java.util.Scanner;

public class Level1q3{
	
	public static char[] CharArray(String array){
		char[] charac=new char[array.length()];
		for(int i=0;i<array.length();i++){
			charac[i]=array.charAt(i);
			
			
		}
		return charac;
	}
	
	public static boolean check(char[] array1, char[] array2){
		
		if(array1.length!=array2.length){
			return false;
		}
		for(int i=0;i<array1.length;i++){
			if(array1[i]!=array2[i]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String array=scanner.nextLine();
		
		char[] array1=CharArray(array);
		char[] array2=array.toCharArray();
		
		boolean result=check(array1,array2);
		
		System.out.println("Characters using user defined method are:");
		
		for(char c:array1){
			System.out.println(c+" ");
			
		}
		
		System.out.println("Characters using built-in method are:");
		
		for(char c:array2){
			System.out.println(c+" ");
			
		}
		
		System.out.println("Are the character arrays are equal? "+result);
		}
		
}