class  G
{
	 int i ;

	 G(int i)
	{
		this.i = i ;
	}
	public static void main(String[] args) 
	{
		G g1 = new G(10);
		System.out.println(g1.i);
		G g2 = new G(20);
		System.out.println(g2.i);
		G g3 = new G(210);
		System.out.println(g3.i);
	}
}
