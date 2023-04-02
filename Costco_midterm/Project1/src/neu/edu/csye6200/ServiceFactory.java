package neu.edu.csye6200;

public class ServiceFactory {

	   private static final Service instance = new Service();
	   
	   private ServiceFactory() {
		   
	   }
	   	   
	   public static Service getInstance() {
		   return instance;
		}
}
