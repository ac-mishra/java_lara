class G 
{
	public static void main(String[] args) 
	{
		System.out.println("abc\nxyz");//2
		System.out.println("\nabc\nxyz");//3
		System.out.println("abc\nxyz\n");//3
		System.out.println("\nabc\nxyz\n");//4
		System.out.println("\nabcxyz\n");//3
		System.out.println("\nabc\n\nxyz\n");//6
	}
}
