class ExceptionDemo3
{
	public static void main(String dt[])
	{
		int a,b,c;
		try
		{
			a=Integer.parseInt(dt[0]);
			b=Integer.parseInt(dt[1]);
			c=a/b;
			System.out.println("Result ="+c);
		}	
		catch(ArrayIndexOutOfBoundsException e)//being base class can catch any exception class object in e
		{
			System.out.println("E
			XCEPTION!!!!!   Enter one more elment");
		}	
		finally
		{
			System.out.println("Thank you");
		}	
	}
}