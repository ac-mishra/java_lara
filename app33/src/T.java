class T
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int s1 = test();
		System.out.println("main end" + s1);
	}
	static int test()
	{
		System.out.println("test");
		return 1000;
	}
}