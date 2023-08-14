package Programs;

public class ReverseString {

	public  static void main(String[] args) {
		
		String s1=  "priyansh";
		
		String rev= "";
		
	int length= s1.length();
	
	System.out.println(length);
	 
//8-1=7
	//i=7                   7>=0
		for(int i= length-1; i>=0; i--)
		{
			rev = rev+s1.charAt(i); //
		}
	
		System.out.println(rev);
		
	
		
	}
	
	
	
	
	
	
	
}
