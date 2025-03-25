public class Level1q5{
	
	public static void generateException(){
		
		String text= "Jhon cena";
		System.out.println(text.charAt(15));
		
	}
	
	public static void HandleEception(){
		
		String text= "Jhon cena";
		try{
			System.out.println(text.charAt(15));
		} catch(StringIndexOutOfBoundsException e){
			System.out.println("caught StringIndexOutOfBoundsException: "+ e.getMessage());
			
		}
		
	}
	
	public static void main(String[] args){
		//generateException();
		HandleEception();
	}
}