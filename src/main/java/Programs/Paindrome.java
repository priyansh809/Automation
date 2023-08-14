package Programs;

public class Paindrome {

public  static void main(String[] args) {
		
		String s1=  "NITIN";
		
		String rev= "";
		
//	int length= s1.length();
//	
//	System.out.println(length);
	 

		for(int i=s1.length()-1; i>=0; i--)
		{
			rev = rev+s1.charAt(i);
		}
	
//		System.out.println("original string "+s1);
//		System.out.println("reverse string " +rev);
		
	if(s1.equals(rev))
			{
		System.out.println("Given string is pallindrome");
		
			}
	else
	{
		System.out.println("Given string is not Pallindrome");
	}
	
	    }
			
	
	
	
}
