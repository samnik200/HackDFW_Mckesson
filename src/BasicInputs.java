public class BasicInputs 
{
	private int height;
	private int weight;
	private boolean recurring;
	private String knownConditions;
	private String explainSymptoms;
	private String allergies;
	private String medications;
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
	public BasicInputs(int height, int weight, boolean recurring, String knownConditions, String explainSymptoms, String allergy, String medications)
	{
		this.height = height;
		this.weight = weight;
		this.recurring = recurring;
		this.knownConditions = knownConditions;
		this.explainSymptoms = explainSymptoms;
		this.allergies = allergy;
		this.medications = medications;
	}
	public BasicInputs(int height, int weight, boolean recurring, String knownConditions, String explainSymptoms, String allergy)
	{
		this.height = height;
		this.weight = weight;
		this.recurring = recurring;
		this.knownConditions = knownConditions;
		this.explainSymptoms = explainSymptoms;
		this.allergies = allergy;
	}
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
	public int getWeight() {
		return weight;
	}

	public boolean isRecurring() {
		return recurring;
	}

	public String getKnownConditions() {
		return knownConditions;
	}

	public String getExplainSymptoms() {
		return explainSymptoms;
	}
	public String getAllergy()
	{
		return allergies;
	}
	public String getMedications()
	{
		return medications;
	}
	
	
}
