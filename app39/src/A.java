class A 
{
	int i;							// non static attribute
	public static void main(String[] args) 
	{
		System.out.println(i);				// fetch a compilation error because it cann't use directly.
	}
}
