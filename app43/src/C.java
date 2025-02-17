class C 
{

	{
		System.out.println("C-IIB");
	}
	C()
	{
		System.out.println("C()");
	}
	C(int i)
	{
		System.out.println("C(int)");
	}
	C(int i, int j)
	{
		System.out.println("C(int, int)");
	}
	
	public static void main(String[] args) 
	{
		C c1 = new B();
		System.out.println("---------------------");
		C c2 = new C(90);
		System.out.println("---------------------");
		C c3 = new C(190);
		System.out.println("---------------------");
		C c4 = new C(19, 20);
	}
}
