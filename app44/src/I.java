class A
{
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		this();
		System.out.println("A(int)");
	}
}

class B  extends A
{
	B()
	{
		super(90);
		System.out.println("B()");
	}
	B(int i)
	{
		System.out.println("B(int)");
	}
}

class C  extends B
{
	C()
	{
		this(90);
		System.out.println("C()");
	}
	C(int i)
	{
		System.out.println("C(int)");
	}
	C(int i, int j)
	{
		System.out.println("C(int, int)");
	}
}
class I 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("----------------------");
		A a2 = new A(10);
		System.out.println("----------------------");
		B b1 = new B();
		System.out.println("----------------------");
		B b2 = new B(10);
		System.out.println("----------------------");
		C c1 = new C();
		System.out.println("----------------------");
		C c2 = new C(10, 40);
		System.out.println("----------------------");
	}
}
