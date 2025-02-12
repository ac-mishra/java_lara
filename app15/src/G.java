class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		if(true)
		{
			
			System.out.println("if block");	
			System.out.println("if block");					
			System.out.println("if block");	
			System.out.println("if block :" +i);
			i +=100;		//i = i + 100;
		}
		
		System.out.println("main end :" +i);			
	}
}
