package part01;

public class Employee extends Person implements Duties{

	static public int nextID = 0;
	private int id;
	private Department dept;
	private String dailyTask;
	
	public Employee(String forename, String surname, 
			Department dept, String dailyTask) {
		super(forename, surname);
		this.dept = dept;
		this.dailyTask = dailyTask;
		nextID++;
		this.id = nextID;
	}

	public int getId() {
		return id;
	}

	public Department getDept() {
		return dept;
	}
	
	@Override
	public void conductTask() {
		System.out.println("Conducting task: " +dailyTask);
	}
	
	@Override
	public String getDetails() {
		return "Name: " +super.getForename()+ " " +super.getSurname()+ 
				" (ID: " +this.id+ ")";
	}	

} // End of class
