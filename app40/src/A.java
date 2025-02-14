class A 
{
	int i;
	static void test (A a1)
	{
		System.out.println("test:" + a1.i);
		a1.i = 40;
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.i);
		a1.i = 20;
		a1.test();
		System.out.println(a1.i);
	}
}
