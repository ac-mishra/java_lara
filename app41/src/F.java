class	F 
{
	int i ;

	F()
	{
		i = 30 ;
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println(f1.i);

		F f2 = new F();
		System.out.println(f2.i);

		F f3 = new F();
		System.out.println(f2.i);
	}
}
