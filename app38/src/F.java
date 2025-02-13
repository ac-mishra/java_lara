class A
{
	static int i;
}
class F 
{
	public static void main(String[] args) 
	{
		//System.out.println(i);			// here is an error because, we cannot use other class members directly.
		System.out.println(A.i);			//here compilation got succeed , because of calling the A class on print stmt.
	}
}
