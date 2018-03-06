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
		return this.msg;
	}
}