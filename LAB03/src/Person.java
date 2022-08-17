
public class Person {
	private Job job;
	
	public Person() {
		job = new Job();
		job.setSalary(12000);
	}
	public long getSalary() {
		return job.getSalary();
	}
	public void setSalary(long wage) {
		job.setSalary(wage);
	}
	
	public void setRole(String roleName) {
		job.setRole(roleName);
	}
	
	public String getRole() {
		return job.getRole();
	}
	public void setId(int emId) {
		job.setId(emId);
	}
	
	public int getId() {
		return job.getId();
	}
	
	public void setPerson(String roleName, long wage,int emId) {
		job.setRole(roleName);
		job.setSalary(25000);
		job.setId(emId);
	}
	
	public void setPerson(Job jobDetail) {
		job.setRole(jobDetail.getRole());
		job.setSalary(jobDetail.getSalary());
		job.setId(jobDetail.getId());
	}
	
	public void setPerson(Position pos) {
		job.setRole(pos.getPositionName());
		job.setSalary(pos.getSalary());
		job.setId(pos.getPositionId());
	}
	
	public String toString() {
		return "Role : "+getRole()+",Salary : "+getSalary()+", Employee ID : "+getId() ;
	}
}
