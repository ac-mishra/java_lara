class E
{
	static int i = test1();		
	static int j = test2();		

	static int test1()
	{
		System.out.println("test1" + i + ", " + j);
		i = i + j + 2;
		j = i + j + 3;
		return  i + j + 5;				
	}
	static int test2()
	{
		System.out.println("test2" + i + ", " + j);
		i = i + j + 6;
		j = i + j + 7;
		return  i + j + 8;				
	}
	public static void main(String[] args)
	{
		System.out.println("main" + i + ", " + j);		
	}
}


