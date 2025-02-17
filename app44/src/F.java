class A
{
	static int i;
	static void test1()
	{
		System.out.println("A-test");
	}
}
class  F extends A
{
	public static void main(String[] args) 
	{
		F.test1();
		System.out.println(F.i);
	}
}
