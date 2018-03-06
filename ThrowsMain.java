class ThrowsDemo
{
	public int divide(int a,int b)throws Exception
	{
		return a/b;
	}	
}	
class ThrowsMain
{
	public static void main(String dt[])
	{
		try
		{
			ThrowsDemo obj=new ThrowsDemo();
			System.out.println(obj.divide(10,5));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}