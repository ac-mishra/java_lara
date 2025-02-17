abstract class A
{
	abstract void test();
	void test2()
	{
		System.out.println("A-test2");
	}

}
class F extends A
	{
		void test()
	{
		System.out.println("A-test1");
	}
	public static void main (String[] args)
	{
		F f1 = new F();
		f1.test1();
		f2.test2();
		System.out.println("d1");
	}
}