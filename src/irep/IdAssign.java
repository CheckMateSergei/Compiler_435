package irep;

public class IdAssign extends Assignment
{
	public Temp temp1, temp2;

	public IdAssign(Temp temp1, Temp temp2)
	{
		this.temp1 = temp1;
		this.temp2 = temp2;
	}

	public String toString()
	{
		return temp1.toString()+" := "+temp2.toString();
	}
	
}
