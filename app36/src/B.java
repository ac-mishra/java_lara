class B
{
	static int i = test();		//here i = 0

	static int test()
	{
		System.out.println("test");
		return 100;				//here i = 100
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(i);
		i += 20;				
		System.out.println(i);
		System.out.println("main end");
	}
}


//  i data type and test() return type both should be same.