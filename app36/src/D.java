class D
{
	static int i = test();		
	static int j = test();		

	static int test()
	{
		System.out.println("test" + i + ", " + j);
		return  i + j + 30;				
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(i);
		System.out.println(j);
		System.out.println("main end");
	}
}


