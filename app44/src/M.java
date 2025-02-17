class A
{
	static
	{
		System.out.println("A-SIB");
	}
}


class M extends A
{
	static
	{
		System.out.println("M-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
