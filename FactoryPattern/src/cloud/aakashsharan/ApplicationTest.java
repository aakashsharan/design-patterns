package cloud.aakashsharan;

import org.junit.Test;

public class ApplicationTest {
	
	@Test
	public void testFactoryPattern() throws Exception{
		
		DogFactory dFactory = new DogFactory();
		
		Dog dog1 = dFactory.getDog("small");
		dog1.speak();
		
		Dog dog2 = dFactory.getDog("large");
		dog2.speak();
		
		Dog dog3 = dFactory.getDog("extra large");
		dog3.speak();
	}

}
