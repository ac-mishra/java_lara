class O 
{
	int i;
	static void test(O arg)
	{
		System.out.println("test:" + arg.i);
		arg.i = 30;
	}
	public static void main(String[] args) 
	{
		O o1 = new O();
		o1.i = 10;
		System.out.println(o1.i);
		test(o1);
		System.out.println(o1.i);

	}
}
