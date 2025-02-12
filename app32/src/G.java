class G
{
	static void test(int i, int j)
	{
		System.out.println("test:" + i + "," + j);
		i = 6000;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(20, 50);
		System.out.println("main end" + i);
	}
	
}
