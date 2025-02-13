class T
{
	public static void main(String[] args) 
	{
		if (args.length < 2)
		{
			System.out.println("pls supply 2 int command line args");
			return;
		}
		int rowsCount = Integer.parseInt(args[0]);
		int colsCount = Integer.parseInt(args[1]);
		for (int rows = 1; rows <= rowsCount ; rows++ )
		{
			for (int cols = 1; cols  <= colsCount ; cols++ )
			{
				System.out.print(1 + "  ");
			}
			System.out.println();
		}
	}
}