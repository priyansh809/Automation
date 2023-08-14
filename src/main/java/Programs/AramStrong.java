package Programs;

public class AramStrong {
	
	public static void main(String[] args) {
		
		
		int org= 155;
		
		int sum= 0;
		
		
		// 153   153>0 15>0
for(int i = org; i>0; i=i/10) //153/10=    15.3  15/10 =1.5
	
	

{
	
	int rem= i%10; //153%10= 3   
	//  15%10 =5
	//1%10 = 1
	
	sum= sum + (rem*rem*rem); // 0+3*3*3
	
	//27+5*5*5

	//27+125+1= 153
	
	
}

if(org==sum) {
	
	System.out.println("given number is armstrong number");
}
else {
	
	System.out.println("given number is  not armstrong number");
}
	
	
}
		
		
		
		
	}
	

