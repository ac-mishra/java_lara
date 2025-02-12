class H
{
	static void test(int i, int j)
	{
		System.out.println("test:" + i + "," + j);
		i = 6000;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int a = 20;
		test(a, 50);
		System.out.println("main end" + a);
	}
	
}
