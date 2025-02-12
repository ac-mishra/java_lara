class B
{
	public static void main(String[] args) 
	{
		int i = 0;
		if (i++ == 0)
		{
			System.out.println(i);
			i += 7;
		}
		else if (i++ == 1)
		{
			System.out.println(i);
			i += 9;
		}
		else if (i++ == 2)
		{
			System.out.println(i);
			i += 11;
		}
		System.out.println(i);
	}
}
