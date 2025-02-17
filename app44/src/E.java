class D
{
	int i;
	void test1();
	{
		System.out.println("D-test");
	}
}

class  E extends D
{
	int j;
	void test2()
	{
		System.out.println("E-test");
	}
	public static void main(String[] args) 
	{
		E e1 = new E();
		
		System.out.println(e1.i);
		System.out.println(e1.j);
		e1.test1();
		e1.test2();
	}
}
