class V
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("abc:" + test());
		System.out.println("-----------");
		System.out.println(2000 + test());
		System.out.println("------------");
		System.out.println("test()" + test());
		System.out.println("-----------");
		System.out.println("main end" );
	}
	static int test()
	{
		System.out.println("test");
		return 1000;
	}
}