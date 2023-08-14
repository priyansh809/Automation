package Programs;

public class ArmStrongNumber
{

	public static void main(String[] args)
	{
	
		int OrgNum=153;
		int sum=0;
		       // 153  153>0   15>0 1>0 0>0
		for(int i= OrgNum;i>0;i=i/10) // 153/10=15.3=15 15/10=1.5 1/10=0.1
		{
			int rem =i%10;  // 153%10=3 15%10=5 1%10 1
			sum=sum+(rem*rem*rem);  //0=3*3*3+5*5*5+1*1*1=153
		}//153==153
		if(OrgNum==sum)
		{
			System.out.println("Given number"+OrgNum+"is an ArmStrong Number");
		}
		else 
		{
			System.out.println("Given number"+OrgNum+"is Not an ArmStrong Number");
		}
	}
}
