class C
{
	static int i = test();

	static
	{
		System.out.println("c-SIB");
	}

	static int test()
	{
		System.out.println("c-SIB");
		return 200;
	}

	public static void main(String[] args) 
	{
		System.out.println("c- main" + i);
	}
}
