class K 
{
	static int i;
	int j;
	public static void main(String[] args) 
	{
		K k1 = new K();
		k1.i = 10;
		k1.j = 20;

		K k2 = new K();
		k2.i = 110;
		k2.j = 120;

		K k3 = new K();
		k3.i = 510;
		k3.j = 610;
		System.out.println(k1.i + ", " + k1.j);
		System.out.println(k2.i + ", " + k2.j);
		System.out.println(k3.i + ", " + k3.j);
		k1.i = 4000;
		System.out.println(k2.i );
		System.out.println(k3.i);
	}
}
