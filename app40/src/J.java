class J 
{
	int i;
	void test1()
	{
		System.out.println("test1:" + i);
		i += 10;
		test2();
	}
	void test2()
	{
		System.out.println("test2:" + i);
		i += 20;
	}
	public static void main(String[] args) 
	{
		J j1 = new J();
		j1.i = 5;
		System.out.println("main:" + j1.i);
		j1.test1();
		System.out.println("main:" + j1.i);
		j1.i =+ 30;
		j1.test2();
		System.out.println("main:" + j1.i);
	}
}
