class A
{
	A()
	{
		System.out.println("A()");
	}
}



class  G extends A
{
	G()							//here sub class constructor calling to superclass constructor
	{
		super();
		System.out.println("G()");
	}
	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println("done");
	}
}
