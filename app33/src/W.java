class W
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1000 + test();
		System.out.println("abc:" + test() +i);
		System.out.println("-----------");
		System.out.println("sum:"2000 + test());
		System.out.println("------------");
		System.out.println(test() + test() + "is sum");
		System.out.println("-----------");
		System.out.println("main end" );
	}
	static int test()
	{
		System.out.println("test");
		return 1000;
	}
}