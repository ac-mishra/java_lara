class E 
{
	public static void main(String[] args) 
	{
		int i = 9;
		System.out.println(true || (i == 9));
		System.out.println(true || (i != 9));
		System.out.println(false || (i != 9));
		System.out.println(false || (i == 9));
	}
}
