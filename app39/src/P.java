class P 
{
	int i;
	public static void main(String[] args) 
	{
		P p1 = new P();
		p1.i = 10;
		System.out.println(p1.i);
		test (p1);
		System.out.println(p1.i);
		p1.i += 20;
		test (p1);
		System.out.println(p1.i);
		p1.i += 30;
		test(p1);
		System.out.println(p1.i);
	}
	public static void test(P ref)
	{
		System.out.println("test:" + ref.i);
		ref.i += 40;
	}
}
