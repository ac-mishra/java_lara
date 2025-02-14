class C 
{
	void test ()		//we cannot call a test methord without a reference.
	{
		System.out.println("test:" + this);
	}
	public static void main(String[] args) 
	{
		C c1 = new c();
		System.out.println("main:" + c1);
		c1.test();
	}
}
