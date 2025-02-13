class L 
{ 
	int i;
	public static void main(String[] args) 
	{
		L o1 = new L();
		L o2 = o1;
		L o3 = o1;
		L o4 = o1;

		o3.i = 10;


		System.out.println(o1.i);
		System.out.println(o2.i);
		System.out.println(o3.i);
		System.out.println(o4.i);
	}
}
