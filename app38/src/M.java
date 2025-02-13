class A
{
	static int i;

	static
	{
		System.out.println("A-SIB");
	}
}
class B
{
	static int i;

	static
	{
		System.out.println("B-SIB");
	}
	static void test()
	{
		System.out.println("B-test");
	}
}
class M
{
	static
	{
		System.out.println("M-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(A.i);
		System.out.println(A.i);
		A.i = 300;
		System.out.println(A.i);
		System.out.println(A.i);
		System.out.println("main end");
	}
}
