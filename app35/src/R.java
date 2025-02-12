class R 
{
	static int a;
	public static void main(String[] args) 
	{
		System.out.println(R.a);
		R.a = 100;
		System.out.println(R.a);
	}
}
