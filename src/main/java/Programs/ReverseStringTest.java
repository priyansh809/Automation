package Programs;

public class ReverseStringTest {

	public static void main(String[] args) {
		
		String s1 =  "Automation";
		
		String rev = "";
		
		
		int length = s1.length();
		
		System.out.println(length);
		
  for(int i = length-1; i>=0; i--) {
	  
	  rev= rev+s1.charAt(i);  
  }
  
  System.out.println(rev);
		
}
	
	
}
