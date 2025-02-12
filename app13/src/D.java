class D 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(85));
	}
}


/*
		85	/	2		==>		42		+		rem 1
		42	/	2		==>		21		+		rem 0
		21	/	2		==>		10		+		rem 1
		10	/	2		==>		 5		+		rem 0
		 5	/	2		==>		 2		+		rem 1
		 2	/	2		==>		 1		+		rem 0
		 1	/	2		==>		 0		+		rem 1
		 ====================================================
                                                   1010101
*/