class A
{
	static int i;

	static
	{
		System.out.println("A-SIB");
	}
}
class L 
{
	static
	{
		System.out.println("L-SIB");
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
