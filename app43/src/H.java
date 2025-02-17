class H 
{
	static int i;
	public static void main(String[] args) 
	{
		H obj = new H();
		System.out.println(i);
		System.out.println(H.i);
		System.out.println(obj.i);		// System.out.println(H.i);
	}
}


//it convert obj to H because obj here calls to H.