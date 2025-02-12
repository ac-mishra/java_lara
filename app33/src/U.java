class U
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(test());
		System.out.println("main end" );
	}
	static int test()
	{
		System.out.println("test");
		return 1000;
	}
}