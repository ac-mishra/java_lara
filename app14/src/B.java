class B 
{
	public static void main(String[] args) 
	{
		//System.out.println(Integer.toBinaryString(95));
		System.out.println(95 >> 1);	//	right shift by 1
		System.out.println(95 >> 2);	//	right shift by 2
		System.out.println(95 >> 3);	//	right shift by 3

		System.out.println(95 << 1);	//	left shift by 1
		System.out.println(95 << 2);	//	left shift by 2
		System.out.println(95 << 3);	//	left shift by 3

	}
}


/*
		95		===>		1011111
		95 >> 1 ===>		 101111		==> (47)  the decimal representation

		95		===>		1011111
		95 >> 2 ===>		  10111		==> (23)  the decimal representation
											
		95		===>		1011111			
		95 >> 3 ===>		   1011		==> (11)  the decimal representation


		95		===>		1011111
		95 << 1 ===>	   10111110		==> (190)  the decimal representation

		95		===>		1011111
		95 << 2 ===>	  101111100		==> (380)  the decimal representation

		95		===>		1011111
		95 << 3 ===>	 1011111000		==> (760)  the decimal representation
*/