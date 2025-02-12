class A 
{
	public static void main(String[] args) 
	{
		int i = 90;
		String s1 = Integer.toBinaryString(i);
		System.out.println(i);
		System.out.println(s1);
	}
}


/*
	90 / 2		==>		45		+		rem     0
	45 / 2		==>		22		+		rem	    1
	22 / 2		==>		11		+		rem		0
	11 / 2		==>		5		+		rem		1
	 5 / 2		==>		2		+		rem		1
	 2 / 2		==>		1		+		rem		0
	 1 / 2		==>		1   	+		rem		1
	==================================================
	                                            1011010
	


*/