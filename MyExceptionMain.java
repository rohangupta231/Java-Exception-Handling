class MyException extends Exception
{
	private String msg;
	public MyException()
	{
		this.msg="No info available";
	}
	public MyException(String msg)
	{
		this.msg=msg;
	}
	public String toString()
	{
		//return ("MyException:"+this.msg);
		return (super.toString()+":"+this.msg);
	}
}
class MyExceptionMain
{
	public static void main(String dt[])
	{
		int a,b,c;
		try
		{
			a=Integer.parseInt(dt[0]);
			if(a==0)
			{
				throw new MyException();//Exception e= new Exception();
			}
			b=Integer.parseInt(dt[1]);
			c=a/b;
			System.out.println("Result ="+c);
		}	
		catch(ArrayIndexOutOfBoundsException e)//being base class can catch any exception class object in e
		{
			System.out.println("EXCEPTION!!!!!   Enter one more elment");
		}	
		catch(ArithmeticException e)
		{
			System.out.println("Cant be divided my 0");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Cant Take String As Argument");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Thank you");
		}	
	}
}