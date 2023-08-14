package Programs;

public class Numberwhitespeces {
	
	public static void main(String[] args) {
	//               012345	
		 String a = "x yz  ";
		 
		 int count= 0;
		 
		 
		          //    0<=4 1<=5 2<=5 3<=4  4<=5  5<=5
		 for(int i = 0; i<=a.length()-1; i++) {
			 
	char s = a.charAt(i);// x y z
	
			 if(s==' ') {
				 
				 count= count+1; //1 + 1 = 2
				 
				 
			 }
			 
			 
		 }
		 System.out.println(count);
		
	}
	
	
	
	
	

}
