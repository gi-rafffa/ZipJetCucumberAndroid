package test.java.framework;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;

public class User {
	
	    public final String firstName;
	    public final String lastName;
	    public final String email;
	    public final String phone;

	    public User(){
	    	Fairy fairy = Fairy.create();
	    	Person person = fairy.person();
	        this.firstName = person.getFirstName();
	        this.lastName = person.getLastName();
	        this.email = person.getEmail();
	        this.phone = person.getTelephoneNumber();
	    }

	    public User(String name, String surname, String phone, String email){
	    	   this.firstName = name;
		        this.lastName = surname;
		        this.email = email;
		        this.phone = phone;
	       
	    	// return new User("Test User", "andreas+" + ThreadLocalRandom.current().nextInt(0, Integer.MAX_VALUE) + "@gmail.com", displayName);
	    }

}
