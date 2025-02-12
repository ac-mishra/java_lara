class H 
{
	public static void main(String[] args) 
	{
		String s1 = "abc";
		String s2 = "xyz";
		String s3 = "abc";
		String s4 = "xyz";
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s2 == s3);
		System.out.println(s2 == s4);
		System.out.println(s3 == s4);
		System.out.println(s1 != s2);
		System.out.println(s1 != s3);
		System.out.println(s1 != s4);
		System.out.println(s2 != s3);
		System.out.println(s2 != s4);
		System.out.println(s3 != s4);
	}
}
