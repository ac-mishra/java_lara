class A 
{
	A()
	{
		System.out.println("A()");		//it shouldnot have a return type.
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("-----------------");
		A a2 = new A();
		System.out.println("-----------------");
	}
}
