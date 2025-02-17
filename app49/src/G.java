abstract class A
{
	abstract void test();
	void test2()
	{
		System.out.println("G-test2");
	}
	abstract void test3();

}
class G extends A
	{
		void test1()
	{
		System.out.println("G-test1");
	}
	{
		void test3()
	{
		System.out.println("G-test3");
	}
	public static void main (String[] args)
	{
		G g1 = new G();
		G1.test1();
		G2.test2();
		G2.test3();
		System.out.println("done");
	}
}