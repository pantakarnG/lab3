
public class TestClass {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setRole("Manager");
		p1.setSalary(25000);
		p1.setId(01);
		System.out.println(p1);
		Person p2 = new Person();
		p2.setPerson("Programmer", 25000, 02);
		System.out.println(p2);
		
		Job j1 = new Job();
		j1.setRole("Tester");
		j1.setSalary(30000);
		j1.setId(03);
		Person p3 = new Person() ;
		p3.setPerson(j1);
		System.out.println(p3);
	
		Position pos1 = new Position();
		pos1.setPositionId(04);
		pos1.setSalary(12000);
		pos1.setPositionName("Security");
		Person p4 = new Person();
		p4.setPerson(pos1);
		System.out.println(p4);
	}
}
