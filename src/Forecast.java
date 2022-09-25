
import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.MongoClient; 
public class Forecast { 
   
	private MongoClient mongo;
	private BasicInputs input;
   public Forecast(BasicInputs input) throws UnknownHostException
   {
	      mongo = new MongoClient( "localhost" , 27017 );
	      this.input = input;

   }
   DBObject person = new BasicDBObject("_id", "jane")
           .append("name", "Jane Doe")
           .append("height", "60 inches")
           .append("weight", 125)
           .append("medications", input.getMedications())
           .append(null, input);
   
   
      
      // Accessing the database 
      DB database = mongo.getDB("MyDB");
           
   
}
