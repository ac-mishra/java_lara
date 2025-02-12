class N 
{
	public static void main(String[] args) 
	{
		int i = 5;
		System.out.println(i++  +  i  +  i++  +  i  +  i++  +  i  +  i++  +  i);		//5+6+6+7+7+8+8+9=56
		System.out.println(i);		//9
		System.out.println(i--  +  i  +  i++  +  i  +  i--  +  i  +  i++  +  i);		//9+8+8+9+9+8+8+9=68
		System.out.println(i);		//9
	}
}
