class G 
{
	int i;

	void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println(g1.i);
		g1.test();
		g1.i = 10;
		System.out.println(g1.i);
		g1.i = 20;
		System.out.println(g1.i);
		g1.test();
	}
}
