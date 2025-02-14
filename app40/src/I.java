class I 
{
	int a;
	void test()
	{
		System.out.println("test:" + a);
			a = 400;
	}
	public static void main(String[] args) 
	{
		I obj = new I();
		obj.a = 40;
		obj.test();
		System.out.println("main:" + obj.a);
	}
}
