abstract class A
{
	abstract void test();
	void test2()
	{
		System.out.println("G-test2");
	}
	abstract void test3();

}
abstract class B extends A
{
		void test1()
	{
		System.out.println("B-test1");
	}
}
class H extends B
{
		void test3()
	{
		System.out.println("H-test3");
	}
	public static void main (String[] args)
	{
		H h1 = new H();
		h1.test1();
		h2.test2();
		h2.test3();
		System.out.println("done");
	}
}