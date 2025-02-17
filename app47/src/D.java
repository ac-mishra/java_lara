class A
{
	private void test()
	{
		System.out.println("A-test");
	}
}

class D 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.test();
		System.out.println("Hello World!");
	}
}
