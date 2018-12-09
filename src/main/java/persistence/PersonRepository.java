package persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class PersonRepository {
		

	  EntityManagerFactory entityManagerFactory;

	  public PersonRepository() {
	    try {
	      entityManagerFactory = Persistence.createEntityManagerFactory("persons");
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }

	  public Person add(Person person) {
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    entityManager.getTransaction().begin();
	    entityManager.persist(person);
	    entityManager.getTransaction().commit();
	    return person;
	  }

	  
}
