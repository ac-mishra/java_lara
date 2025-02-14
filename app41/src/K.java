class  K
{
	K()
	{
		System.out.println("K()");
	}
	K(int i)
	{
		System.out.println("K(int)");
	}
	K(int i, int j)
	{
		System.out.println("K(int, int j)");
	}
	K(int i, double j)
	{
		System.out.println("K(int, double j)");
	}
	public static void main(String[] args) 
	{
		K k1 = new K();
		System.out.println("----------------");
		K k2 = new K(10, 2.0);
		System.out.println("----------------");
		K k3 = new K(1, 4.7);
		System.out.println("----------------");
		K k4 = new K(34);
		System.out.println("----------------");
	}
}
