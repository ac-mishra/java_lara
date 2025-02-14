class M 
{
	int param;

	void setParam(int param)
	{
		this.param = param;
	}


	public static void main(String[] args) 
	{
		M m1 = new M();
		System.out.println(m1.param);
		m1.setParam(90);
		System.out.println(m1.param);
	}
}
