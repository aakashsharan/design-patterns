package cloud.aakashsharan.singleton;

public class SPObject {
	
	// private instance, can only be accessed by getInstance method.
	private static SPObject instance;
	
	// private constructor
	private SPObject(){
		
	}
	
	public static SPObject getInstance(){
		if(instance == null){
			instance = new SPObject();
		}
		return instance;
	}
	
	public void showMessage(){
		System.out.println("Instance of the  "+SPObject.class);
	}

}
