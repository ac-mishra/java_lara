class B 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		if (false)
		{
			System.out.println(2);
		}
		else
		{
			System.out.println(3);
			if (true)
			{
				System.out.println(4);
			}
			System.out.println(5);
		}
		System.out.println(6);
	}
}
