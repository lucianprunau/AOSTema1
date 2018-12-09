package persistence;

public class PersonRepositoryFactory {

	private static PersonRepository personRepository;

	  public static PersonRepository getPersonRepo(){
	    if (personRepository==null) {
	      personRepository = new PersonRepository();
	      
	    }
	    return personRepository;
	  }
	
}
