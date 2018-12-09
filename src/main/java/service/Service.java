package service;

import persistence.Person;
import persistence.PersonRepository;
import persistence.PersonRepositoryFactory;

public class Service {

	public void add(Person person) {
		
		PersonRepository pr=PersonRepositoryFactory.getPersonRepo();
		pr.add(person);
	}
	
}
