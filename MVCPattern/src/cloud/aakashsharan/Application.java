package cloud.aakashsharan;

import cloud.aakashsharan.controller.PersonController;
import cloud.aakashsharan.model.Person;
import cloud.aakashsharan.view.PersonView;

public class Application {
	
	public static void main(String[] args) {
		
		Person pModel = createPerson();
		PersonView pView = new PersonView();
		
		PersonController pController = new PersonController(pModel, pView);
		pController.updatePersonView();
		
		pModel.setAge(31);
		pModel.setName("Harry");
		pController.updatePersonView();
		
	}
	
	public static Person createPerson(){
		Person person = new Person();
		person.setName("Steve");
		person.setAge(30);
		return person;
	}

}
