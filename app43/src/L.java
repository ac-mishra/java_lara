class L 
{
	static int i;
	L()
	{
		i++;
	}
	L(int a, arg)
	{
		i++;
	}
	L(int a, int b)
	{
		i++;
	}
	public static void main(String[] args) 
	{
		L obj 1 = new L();
		L obj 2 = new L(12);
		L obj 3 = new L();
		L obj 4 = new L();
		L obj 5 = new L(2, 3);
		System.out.println(i);
	}
}
