class A 
{
	public static void main(String[] args) 
	{
		//System.out.println(Integer.toBinaryString(120));
		//System.out.println(Integer.toBinaryString(200));
		System.out.println(120  |  200);	//bitwise or
		System.out.println(120  &  200);	//bitwise and
		System.out.println(120  ^  200);	//bitwise xor
	}
}


/*

		120		==>		01111000
		200		==>		11001000
-----------------------------------
		120 | 200 ==>   11111000	(248)	==>  decimal value
		


		120		==>		01111000
		200		==>		11001000
-----------------------------------
		120 & 200 ==>   01001000	(72)	==>  decimal value
		


		120		==>		01111000
		200		==>		11001000
-----------------------------------
		120 ^ 200 ==>   10110000	(176)	==>  decimal value
	
							   





*/