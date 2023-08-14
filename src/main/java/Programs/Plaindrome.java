package Programs;

public class Plaindrome {
	
	
	public static void main(String[] args) {
		
		String s1 = "MOM";
		String rev = "";
	
		int length= s1.length();
		
		System.out.println(length);
		
		for(int i =length-1; i>=0 ; i--)
		{
			
			rev= rev +s1.charAt(i);
			
         }
		
		if(s1.equals(rev)) 
		{
			
		System.out.println("string is plaindrome");
		
		}
			
	else 
	
	{
			System.out.println("given number is not plaindrome");	
				
	}
			
		
		
			
	}

	
	
	
	
	
	
	
}
