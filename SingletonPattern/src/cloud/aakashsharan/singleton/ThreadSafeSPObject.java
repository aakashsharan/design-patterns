package cloud.aakashsharan.singleton;

public class ThreadSafeSPObject {
	
	// private instance, can only be accessed by getInstance method
	private static ThreadSafeSPObject instance;
	
	//private constructor
	private ThreadSafeSPObject(){
		
	}
	
	public static ThreadSafeSPObject getInstance(){
		if(instance == null){
			instance = new ThreadSafeSPObject();
		}
		return instance;
	}
	
	public void showMessage(){
		System.out.println("Instance of the "+ThreadSafeSPObject.class);
	}

}
