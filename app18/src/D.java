class D
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		if(false)
		{
			System.out.println(2);
		}
		int i = 40;		//here else is not joining with if cause error
		else
		{
			System.out.println(3);
		}
		System.out.println(4);
	}
}
