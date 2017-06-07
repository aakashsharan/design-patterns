package cloud.aakashsharan;

import org.junit.Test;

public class ApplicationTest {
	
	@Test
	public void testBuilderPattern() throws Exception{
		Consumer consumer1 = new Consumer.ConsumerBuilder("Shelly", "Jane", 22012).build();
		System.out.println(consumer1);
		
		Consumer consumer2 = new Consumer.ConsumerBuilder("Doug", "Honda", 31002)
								.age(38)
								.phoneNumber("232-098-8989")
								.address("River Bldvd MA")
								.build();
		System.out.println(consumer2);
		
		Consumer consumer3 = new Consumer.ConsumerBuilder("Steve", "Blacksmith", 21090)
								.age(65)
								// no phoneNumber
								// no address
								.build();
		System.out.println(consumer3);
		
	}

}
