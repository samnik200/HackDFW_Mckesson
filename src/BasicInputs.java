public class BasicInputs 
{
	private int height;
	private int weight;
	private boolean recurring;
	private String knownConditions;
	private String explainSymptoms;
	/**
	 * 
	 * @param height
	 * the Height of the patient
	 * @param weight
	 * the Weight of the patient
	 * @param recurring
	 * if a symptom is recurring
	 * @param knownConditions
	 * Patient explaining known Conditions
	 * @param explainSymptoms
	 * Patient explaining symptoms
	 */
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
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public boolean isRecurring() {
		return recurring;
	}
	public void setRecurring(boolean recurring) {
		this.recurring = recurring;
	}
	public String getKnownConditions() {
		return knownConditions;
	}
	public void setKnownConditions(String knownConditions) {
		this.knownConditions = knownConditions;
	}
	public String getExplainSymptoms() {
		return explainSymptoms;
	}
	public void setExplainSymptoms(String explainSymptoms) {
		this.explainSymptoms = explainSymptoms;
	}
	
	
}
