class L 
{
	L()
	{
		System.out.println("L()");		
	}
	L(int i)
	{
		this();
		System.out.println("L(int)");
	}
	{
		System.out.println("L-IIB");
	}

	public static void main(String[] args) 
	{
		L obj1 = new L();
		System.out.println("------------------");
		L obj2 = new L(90);
	}
}
