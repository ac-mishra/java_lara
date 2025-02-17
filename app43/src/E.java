class E 
{
	E()
	{
		System.out.println("E()");
	}
	{
		System.out.println("E-IIB");
	}
	E(int i)
	{
		this();
		System.out.println("E(int)");
	}
	public static void main(String[] args) 
	{
		E e1 = new E();
		System.out.println("--------------------");
		E e2 = new E(123);
		System.out.println("--------------------");
	}
}
