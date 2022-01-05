
public class Main {

	  private int age;
	  // We declare a private integer, which cannot be accessed by other classes.
	  
	  // Getter - this returns the variable age.
	  public int getAge() {
	    return age;
	  }
	 
	  // Setter - This takes the parameter (newAge) and assigns it to the age variable. The 'this' keyword is used to refer to the current object.
	  public void setAge(int newAge) {
	    this.age =  newAge;
	  }
}
