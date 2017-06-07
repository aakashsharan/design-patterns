package cloud.aakashsharan;

public class DogFactory {
	
	public Dog getDog(String dogType){
		if (dogType == null){
			return null;
		}
		
		if(dogType.equalsIgnoreCase("small")){
			return new SmallBreed();
		}
		
		if(dogType.equalsIgnoreCase("large")){
			return new LargeBreed();
		}
		
		if(dogType.equalsIgnoreCase("Extra Large")){
			return new ExtraLargeBreed();
		}
		return null;
	}

}
