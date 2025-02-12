class Q
{
	static int i;
	public static void main(String[] args) 
	{
		System.out.println(i);
		i = 10;
		System.out.println(i);				//i run from local variable
		int i = 20;
		System.out.println(i);
		System.out.println(Q.i);			//here i run from global variable
		System.out.println(i);
		i = 2000;
		System.out.println(Q.i);			//also, i run from global variable
	}
}


//when we put class name on the sop statement it will refer global variable only.
