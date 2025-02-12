class O
{
	static int i;							//global
	public static void main(String[] args) 
	{
		System.out.println(i);				//here is no local
		int i = 10;							//local
		System.out.println(i);				//here local and global both are available, so local will getting more preference.
		System.out.println(i);
		i = 300;
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
	}
}
