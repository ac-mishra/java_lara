class C
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = test(i++ + i++ + i++ + i);		//10
		System.out.println("from main");
		System.out.println(i);		//4
		System.out.println(j);		//46
	}
	static int test (int i)
	{
		System out.println("test:" + i);	//10
		return i++ +i++ + i++ + i;		//46
	}
}
