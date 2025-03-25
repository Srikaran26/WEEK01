import java.util.Scanner;

public class Level1q2{
	
	public String Substring(String given, int start,int end){
		StringBuilder str1= new StringBuilder();
		for(int i=start;i<end;i++){
			str1.append(given.charAt(i));
		}
		return str1.toString();
	}
	
	public boolean check(String str1, String str2){
		if(str1.length()!=str2.length()){
			return false;
		}
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	
	
	
	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String given=scanner.nextLine();
		
		System.out.println("Enter the starting index of the substring: ");
		int start=scanner.nextInt();
		System.out.println("Enter the ending index of the substring: ");
		int end=scanner.nextInt();
		
		Level1q2 obj=new Level1q2();
		String str1=obj.Substring(given,start,end);
		String str2=given.substring(start,end);
		boolean arequal=obj.check(str1,str2);
		
		System.out.println("Substring using charAt method: " + str1);
        System.out.println("Substring using built-in method: " + str2);
        System.out.println("Are the substrings equal? " + arequal);
		
	}
		
}