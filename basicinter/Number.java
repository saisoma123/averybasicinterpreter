public class Number implements Exp<Integer>
{
	Integer a;
	public Number(Integer a1)
	{
		a = a1;
	}
	public Integer eval()
	{
		return a;
	}

}