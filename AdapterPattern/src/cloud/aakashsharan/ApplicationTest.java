package cloud.aakashsharan;

import org.junit.Test;

public class ApplicationTest {
	
	@Test
	public void AdapterPatternTest() throws Exception{
		AndroidCalendarApp andApp = new AndroidCalendarApp();
		iOSCalendarApp iOSApp = new iOSCalendarApp();
		
		iOSApp androidAdapter = new AndroidAdapter(andApp);
		
		System.out.println("---AndroidCalendarApp---");
		andApp.play();
		andApp.display();
		
		System.out.println("---iOSCalendarApp---");
		iOSApp.run();
		
		//behaves like an iOS App
		System.out.println("---AndroidAdapter---");
		androidAdapter.run();
	}

}
