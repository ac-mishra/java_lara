class  B
{
	public static void main(String[] args) 
	{
		String s1 = Integer.toBinaryString(150);
		System.out.println(s1);
	}
}

/*
	150 / 2		==>		75		+		rem     0
	75 / 2		==>		37		+		rem	    1
	37 / 2		==>		18		+		rem		1
	18 / 2		==>		9		+		rem		0
	 9 / 2		==>		4		+		rem		1
	 4 / 2		==>		2		+		rem		0
	 2 / 2		==>		1   	+		rem		0
	 1 / 2		==>		0   	+		rem		1
	 ===================================================
	 											10010110


*/