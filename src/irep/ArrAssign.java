package irep;

public class ArrAssign extends Assignment
{
	public Temp aTemp, iTemp, vTemp;

	public ArrAssign(Temp aTemp, Temp iTemp, Temp vTemp)
	{
		this.aTemp = aTemp;
		this.iTemp = iTemp;
		this.vTemp = vTemp;
	}

	public String toString()
	{
		return aTemp.toString()+"["+iTemp.toString()+"]"+" := "+vTemp.toString();
	}
}
