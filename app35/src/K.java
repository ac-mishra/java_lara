class K
{
	static int a;		// global variable
	public static void main(String[] args) 
	{
		System.out.println(a);
		a = 45;					//local variable
		System.out.println(a);
		a = 145;
		System.out.println(a);
	}
}
