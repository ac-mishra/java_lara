class M 
{
	static int counter;
	M()
	{
	}

	M (int i)
	{
	}

	M(boolean b1)
	{
	}

	{
		counter ++;
	}
	public static void main(String[] args) 
	{
		M m1 = new M();
		M m2 = new M();
		M m3 = new M(20);
		M m4 = new M();
		M m5 = new M();
		M m6 = new M(true);
		System.out.println(counter);
	}
}
