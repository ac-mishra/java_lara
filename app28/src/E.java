class E
{
	public static void main(String[] args) 
	{
		int i = 10;
		int j = 50;
		while(i++ <= 5 || j-->=40)		
		{
			System.out.println("loop body:" + i);
			i++;
			j--;
		}
		System.out.println("main end:" + i );
		System.out.println("main end:" + j );
	}
}
