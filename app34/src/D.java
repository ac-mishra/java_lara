class D
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = i++ + i + test1(i++) + i +
				i++ + i + test2(i++) + i +
				i++ + i + test3(i++) + i +
				i++ + i + test4(i++) + i ;
		System.out.println("from main:" + i + ", " + j);
	}
	static int test1(int i)
	{
		System.out.println("test1:" +i);
		return i++;
	}
	static int test2(int i)
	{
		System.out.println("test2:" +i);
		return ++i;
	}
	static int test3(int i)
	{
		System.out.println("test3:" +i);
		return --i;
	}
	static int test4(int i)
	{
		System.out.println("test4:" +i);
		return i--;
	}
}
