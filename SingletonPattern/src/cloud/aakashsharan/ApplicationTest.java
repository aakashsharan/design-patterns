package cloud.aakashsharan;

import org.junit.Test;

import cloud.aakashsharan.singleton.SPObject;
import cloud.aakashsharan.singleton.ThreadSafeSPObject;

public class ApplicationTest {
	
	@Test
	public void testSingleton() throws Exception {
		SPObject spObj = SPObject.getInstance();
		ThreadSafeSPObject tfObj = ThreadSafeSPObject.getInstance();
		spObj.showMessage();
		tfObj.showMessage();
	}

}
