package neu.edu.csye6200;

public class DurableFactory {

	private static ItemAPI instance;
	
	private DurableFactory() {
		   instance = null;
	}
	
	public static synchronized ItemAPI getInstance() {
	if (instance == null) {
	instance =  new Durable();
	}
		return instance;
	}
	
}