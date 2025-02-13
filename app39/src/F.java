class F 
{
	void test()
	{
		System.out.println("test");
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		f1.test();
		System.out.println("-------------");
		f1.test();
		System.out.println("---------------");
		f1.test();
		System.out.println("done");
	}
}
