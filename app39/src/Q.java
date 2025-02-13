class Q 
{
	int i;
	static Q test()
	{
		Q q1 = new Q();
		q1.i = 10;
		return q1;
	}
	public static void main(String[] args) 
	{
		Q obj = test();
		System.out.println(obj.i);
	}
}
