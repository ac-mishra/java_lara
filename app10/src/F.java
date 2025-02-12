class F 
{
	public static void main(String[] args) 
	{
		int i = 9;
		System.out.println(true || (i ==9));
		System.out.println((i != 9)|| (i ==9));
		System.out.println((i != 9)|| (i !=9));
		System.out.println((i == 9)|| (i !=9));
		System.out.println((i == 9)|| false);
	}
}
