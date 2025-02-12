class A 
{
	public static void main(String[] args) 
	{
		int i = 1;
		if (i++ == 1)
		{
			System.out.println(i);
			i += 7;
		}
		else
		{
			System.out.println(i);
			i += 9;
		}
		System.out.println(i);
	}
}
