class J //class is a key word
{
	public static void main(String[] args) //main is a fixed identifier
	{
		int a = 10, b = 20;
		System.out.println((a == 10) || (b == 20));
		System.out.println((a != 10) || (b != 20));
		System.out.println((a != 10) && (b != 20));
		System.out.println((a == 10) &&  (b != 20));
		System.out.println((a == 10) && (b == 20));
		System.out.println((a == b) && true );
		System.out.println((a == b) && true );
	}
}
