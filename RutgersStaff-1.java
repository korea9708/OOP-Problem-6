
public class RutgersStaff extends RutgersPerson {
	//Youngjun Kim 171004332

	//As Per 2, Create a variable that will store deparmtnet name
	private String departmentName;
	
	
	
	
	public RutgersStaff() {
		super.setLastName("Stanescu");
		super.setFirstName("Tiberiu");
		this.setNetId("tstanes");
		this.departmentName = "Software Engineering";
	}//End of No Argument Constructor	
	
	
	//Paramterized Construtor
	public RutgersStaff(String lastName, String firstName, String netId, String departmentName ) {

		super.setLastName(lastName);
		super.setFirstName(firstName);
		this.setNetId(netId);
		this.departmentName = departmentName;
		
		
	}//End of Paramterized Construtor: It takes total 4 parameters
	
	
	
	public void setDepartmentName(String departmentName){
		
		this.departmentName = departmentName;
	}//End of setter
	
	
	
	
	public String getDepartmentName() {
		
		return this.departmentName;
	}//End of getter 
	
	@Override
	public void setNetId(String netId) {
		super.setNetId(netId.toUpperCase());
	}//end of setter for overided method: It set the NETID
	
	@Override
	public String toString() {
		return  super.getFirstName()+" "+ super.getLastName()+" works for the "+this.getDepartmentName()+" and the NetID is "+this.getNetId();
	}//end of setter for overided method: Print out the formated string

}
