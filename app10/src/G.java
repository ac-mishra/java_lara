class G 
{
	public static void main(String[] args) 
	{
		int i = 10, j = 30;
		System.out.println((i == 10) || (j == 30));
		System.out.println((i == 10) || (j != 30));
		System.out.println((i != 10) || (j == 30));
		System.out.println((i != 10) || (j != 30));
		System.out.println((i != 10) || true );
		System.out.println((i != 10) || false);
	}
}
