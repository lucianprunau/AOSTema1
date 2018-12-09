package persistence;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persons")
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	
	@Column
	private String name;
	
	@Column
	private String email;
	
	public Person() {
	  }

	  public Person(String name, String email) {
	    this.name = name;
	    this.email = email;
	  }

	  public long getId() {
	    return id;
	  }

	  public void setId(long id) {
	    this.id = id;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getEmail() {
	    return email;
	  }

	  public void setEmail(String email) {
	    this.email = email;
	  }

	  @Override
	  public boolean equals(Object o) {
	    if (this == o) return true;
	    if (!(o instanceof Person)) return false;
	    Person person = (Person) o;
	    return id == person.id &&
	        Objects.equals(name, person.name) &&
	        Objects.equals(email, person.email);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(id, name, email);
	  }
}
