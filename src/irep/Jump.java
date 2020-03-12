package irep;

public class Jump extends Inst
{
	public Label l;

	public Jump(Label l)
	{
		this.l = l;
	}

	public String toString()
	{
		return "GOTO "+l.toString();
	}

}
