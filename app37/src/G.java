class G 
{
	static int i;
	static int j = G.i;		//	indirect read
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
