class K
{
	
	public static void main(String[] args) 
	{
		System.out.println("main begin:");
		int i = 20;
		int j = 500;
		test(i++ + j++ + i++ + j++ , i++ + j++ + i++ + j++);
		System.out.println("main end:" + i + "," + j);
	}
	static void test(int i, int j)
	{
		System.out.println("test:" + i + "," + j);
		i = 6000;
		j = 60;
	}
}
