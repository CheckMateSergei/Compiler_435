package irep;

public class LabelFactory
{
	public int next;

	public LabelFactory()
	{
		next = 0;
	}

	public Label get()
	{
		return new Label(next++);
	}
}
