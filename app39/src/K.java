class K 
{
	int i;
	public static void main(String[] args) 
	{
		K k1 = new K();
		k1.i = 20;
		System.out.println(k1.i);
		K k2 = k1;
		System.out.println(k1.i);
		k2.i = 30;
		System.out.println(k1.i);
		System.out.println(k1.i);
	}
}
