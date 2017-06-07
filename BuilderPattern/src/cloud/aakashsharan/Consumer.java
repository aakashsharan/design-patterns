package cloud.aakashsharan;

public class Consumer {
	
	private final String firstName; //required
	private final String lastName; //required
	private final int age; //optional
	private final int accountNumber; //required
	private final String phoneNumber; //optional
	private final String address; //optional
	
	// only getters for immutability.
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public int getAge(){
		return age;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public String getAddress(){
		return address;
	}
	
	private Consumer(ConsumerBuilder builder){
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.accountNumber = builder.accountNumber;
		this.phoneNumber = builder.phoneNumber;
		this.address = builder.address;
	}
	
	
	
	@Override
	public String toString(){
		return "Consumer details: "+this.firstName+","+this.lastName+","+this.age+","+this.accountNumber+","+this.phoneNumber
				+","+this.address;
	}
	
	public static class ConsumerBuilder{
		private String firstName;
		private String lastName;
		private int age;
		private int accountNumber;
		private String phoneNumber;
		private String address;
		
		public ConsumerBuilder(String firstName, String lastName, int accountNumber){
			this.firstName = firstName;
			this.lastName = lastName;
			this.accountNumber = accountNumber;
		}
		
		public ConsumerBuilder age(int age){
			this.age = age;
			return this;
		}
		
		public ConsumerBuilder phoneNumber(String phoneNumber){
			this.phoneNumber = phoneNumber;
			return this;
		}
		
		public ConsumerBuilder address(String address){
			this.address = address;
			return this;
		}
		
		public Consumer build(){
			Consumer consumer = new Consumer(this);
			validateConsumer(consumer);
			return consumer;
		}
		
		private void validateConsumer(Consumer consumer){
			//System.out.println(consumer+" validated");
		}
	}

}
