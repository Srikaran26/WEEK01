import java.util.Scanner;

public class LowertoUpper {
	
	public static String LowertoUpper(String name){
		StringBuilder result= new StringBuilder();
		for(int i=0;i<name.length();i++){
			char ch=name.charAt(i);
			
			if(ch>='A'&&ch<='Z'){
				
				result.append((char)(ch+32));
			}else{
				
				result.append(ch);
			}
			
			
		}
		return result.toString();
		
	}
	
	public static boolean checkString(String str1,String str2){
		
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
		System.out.println("Enter the String: ");
		
		String name=scanner.nextLine();
		
		String str1=LowertoUpper(name);
		String str2=name.toLowerCase();
		
		System.out.println("The lower cased string without using built in methods: "+str1);
		System.out.println("The lower cased string with using built in methods: "+str2);
		
		if(checkString(str1,str2)){
			System.out.println("Both are same");
			
		}else{
			System.out.println("Both are not same");
		}
		
	}
}