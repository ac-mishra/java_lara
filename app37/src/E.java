class E 
{
	static int i;

	static
	{
		test();
	}

	static void test()		
	{
		System.out.println(i);	//direct read 
		i = 200;			//direct write 

		System.out.println(D.i);	//indirect read
		D.i = 200;			//indirect write
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
