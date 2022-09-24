public class BasicInputs 
{
	private int height;
	private int weight;
	private boolean recurring;
	private String knownConditions;
	private String explainSymptoms;
	public BasicInputs(int height, int weight, boolean recurring, String knownConditions, String explainSymptoms)
	{
		this.height = height;
		this.weight = weight;
		this.recurring = recurring;
		this.knownConditions = knownConditions;
		this.explainSymptoms = explainSymptoms;
	}
	public BasicInputs(int height, int weight, boolean recurring, String knownConditions)
	{
		this.height = height;
		this.weight = weight;
		this.recurring = recurring;
		this.knownConditions = knownConditions;
	}
	public BasicInputs(int height, int weight, boolean recurring)
	{
		this.height = height;
		this.weight = weight;
		this.recurring = recurring;
	}
	public BasicInputs(int height, int weight)
	{
		this.height = height;
		this.weight = weight;
	}
	
	
}
