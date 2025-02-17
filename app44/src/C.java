class A
{	
	void test()
	{
		System.out.println("A-test");
	}
}
class  C extends A
{
	int i;
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println(c1.i);
		c1.test();
	}
}
