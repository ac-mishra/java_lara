class R 
{
	int i;
	public static void main(String[] args) 
	{
		R r1 = test();
		System.out.println("main:" + r1.i);
	}

	public static R test()
	{
		R obj = new R();
		obj.i = 300;
		System.out.println("test:" + obj.i);
		return obj;
	}
}
