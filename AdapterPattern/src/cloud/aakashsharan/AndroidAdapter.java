package cloud.aakashsharan;

public class AndroidAdapter implements iOSApp{
	
	AndroidApp android;
	
	public AndroidAdapter(AndroidApp android){
		// referencing the adapting object.
		this.android = android;
	}
	
	
	@Override
	public void run(){
		android.play();
	}

}
