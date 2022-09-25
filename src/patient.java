import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
public class patient extends BasicDBObject{
	public patient(BasicInputs input)
	{
		new BasicDBObject("_id", "jane")
		           .append("name", "Jane Doe")
		           .append("height", "60 inches")
		           .append("weight", 125)
		           .append("medications", input.getMedications())
		           ;
	}

}
