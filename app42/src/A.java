class A 
{
	A()
	{
		System.out.println("A()")
	}
	A(int i)
	{
		System.out.println("A(int)")
	}

	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("----------------");
		A a1 = new A(20);
		System.out.println("----------------");
		A a3 = new A();
		System.out.println("----------------");
		A a4 = new A(120);
		System.out.println("----------------");
		// A a5 = new A(120, 300);   //   here we found a compilation error


	}
}
