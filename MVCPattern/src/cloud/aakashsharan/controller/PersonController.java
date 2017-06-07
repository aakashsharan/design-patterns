package cloud.aakashsharan.controller;

import cloud.aakashsharan.model.Person;
import cloud.aakashsharan.view.PersonView;

public class PersonController {
	
	private Person model;
	private PersonView view;
	
	public PersonController(Person model, PersonView view){
		this.model = model;
		this.view = view;
	}
	
	public void setPersonName(String name){
		model.setName(name);
	}
	
	public String getPersonName(){
		return model.getName();
	}
	
	public void setPersonAge(int age){
		model.setAge(age);
	}
	
	public int getPersonAge(){

		return model.getAge();
	}
	
	public void updatePersonView(){
		view.getPersonDetails(model.getName(), model.getAge());
	}

}
