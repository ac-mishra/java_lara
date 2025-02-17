class E 
{
	E(int i, int j)
	{
	}
	E(int i )
	{
	}
	public static void main(String[] args) 
	{
		E e1 = new E(90, 190);
		E e2 = new E();
		E e3 = new E(120);
		System.out.println("Hello World!");
	}
}


// here compiler will not providing a default constructor.
