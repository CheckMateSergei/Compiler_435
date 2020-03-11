package irep;

public class IdAssign extends Assignment
{
	public Temp temp;
	public Constant con;

	public IdAssign(Temp temp, Constant con)
	{
		this.temp = temp;
		this.con = con;
	}

	public String toString()
	{
		return temp.toString()+" := "+con.toString();
	}
	
}
