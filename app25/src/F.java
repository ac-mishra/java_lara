class F
{
	public static void main(String[] args) 
	{
		int i = 0;
		if (i++ == i++)
		{
			System.out.println(i);
			i += 7;
		}
		else if (i++ == ++i)
		{
			System.out.println(i);
			i += 9;
		}
		else if (++i == i++)
		{
			System.out.println(i);
			i += 11;
		}
		System.out.println(i);
	}
}
