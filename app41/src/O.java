class O
{
	O()
	{
		this(20);
		System.out.println("O( )");
	}
		O(int i)
	{
		System.out.println("O(int )");
	}
	public static void main(String[] args) 
	{
		O o1 = new o();
		System.out.println("Hello World!");
		O o2 = new o(90);
	}
}
