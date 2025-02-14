class P 
{
	P()
	{
		this(90);
		System.out.println("P()");
	}
	P(int i)
	{
		this(90, i);
		System.out.println("P(int)");
	}
	P(int i, int j)
	{
		System.out.println("P(int, int)");
	}
	public static void main(String[] args) 
	{
		P p1 = new P();
		System.out.println("---------------------");
		P p2 = new P(20);
		System.out.println("---------------------");
		P p3 = new P(20, 30);
		System.out.println("---------------------");
	}
}
