package Programs;

public class plaindromeNum {

	 public static void main(String[] args) {
		
		int num=121,c,r,s=0;
		c= num;
		while(num>0)
		{
			r= num%10;
			s=(s*10)+r;
			num= num/10;
			
		}
		
            if(c==s)
            {
	               System.out.println("number is plaindrome");
             }else 
             {
	             System.out.println("number is not plaindro//me");
             }
	
}
	
	
}
	
	
	

	
	
	
	
	
	
	
	
	

