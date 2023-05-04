public class Names {

  private String firstName;
  private String middleName;
  private String lastName;
  // three varaibles of String Type

  public Names(String firstName, String middleName, String lastName) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
  }
  // a constructor

  public String getFirstName() {
    return this.firstName;
  }

  public String getMiddleName() {
    return this.middleName;
  }

  public String getLastName() {
    return this.lastName;
  }

  // an object now must be created
  public static void main(String[] args) {
    System.out.println("Firstname is:");

    Names person1 = new Names("Jonathan",  "Bali", "Mohabir");

    System.out.println("Here is a new Person \n" + "Firstname: " + person1.getFirstName() + "Second Name \n"
        + person1.getMiddleName() + "Last Name:  \n" + person1.getLastName());
  }
}


// still got the superrrr basics 