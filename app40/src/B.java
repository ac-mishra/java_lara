class B 
{
	int i;
	void test()
	{
		System.out.println("test");
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		b1.test();
	}
}
