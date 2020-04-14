public class RutgersPerson {
	private String lastName;
	private String firstName;
	private String netId;

	public RutgersPerson() {
		this.lastName = "Stanescu";
		this.firstName = "Tiberiu";
		this.netId = "tstanes";
	}// end of no argument contstructor

	public RutgersPerson(String lastName, String firstName, String netId) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.netId = netId;
	}// end of constructor with 3 arguments

	public String getLastName() {
		return lastName;
	}// end of getLastName()

	public String getFirstName() {
		return firstName;
	}// end of getFirstName()

	public String getNetId() {
		return netId;
	}// end of getNetId()

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}// end of setLastName(String lastName)

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}// end of setFirstName(String firstName)

	public void setNetId(String netId) {
		this.netId = netId;
	}// end of setNetId(String netId)
}// end of RutgerPerson