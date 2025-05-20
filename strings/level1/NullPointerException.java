public class NullPointerException {
	
	public static void generateException(){
		
		String text= null;
		System.out.println(text.length());
		
	}
	
	public static void HandleEception(){
		
		String text=null;
		try{
			System.out.println(text.length());
		} catch(java.lang.NullPointerException e){
			System.out.println("caught NullPointerException: "+ e.getMessage());
			
		}
		
	}
	
	public static void main(String[] args){
		//generateException();
		HandleEception();
	}
}