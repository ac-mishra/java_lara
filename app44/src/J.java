class A
{
	A(int i, int j)
	{
		System.out.println("A(int, int)");
	}
}



class  J extends A
{
	J(int i, int j)
	{
		System.out.println("J(int i, int j)");
	}
	public static void main(String[] args) 
	{
		J ji = new J(10, 20);
		System.out.println("done");
	}
}
