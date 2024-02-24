package feb23rd;

public class BreakDemo1 {

	public static void main(String[] args) {
		
		label1:
		for(int j=1;j<=10;j++)
		{
		for(int i=1;i<=10;)
		{
			
		
			if(i==5)
			{
			System.out.println(j+"---"+i);
			
			break label1;
			}
			i=i+1;
			
		}

		}
		
		System.out.println("End of Program..");
	}

}
