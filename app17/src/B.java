class B
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			System.out.println(1);
			if(true)				
				System.out.println(2);				
			System.out.println("3");
		}
		System.out.println("main end");
	}
}
