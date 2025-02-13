class I 
{
	int a, b;
	public static void main(String[] args) 
	{
		I ref = new I();
		System.out.println(ref.a);
		System.out.println(ref.b);
		System.out.println("--------------");
		ref.a = 300;
		ref.b = 300;
		System.out.println(ref.a);
		System.out.println(ref.b);
		System.out.println("---------------");
	}
}
