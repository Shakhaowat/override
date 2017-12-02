package Employee;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee em1=new Employee();
		em1.setName("Hasan");
		em1.setPosition("chairman");
		em1.setSalary(80000);
		
		
	System.out.println(em1.getName()+" is the "+em1.getPosition()+" of this company,and his salry is about "+em1.getSalary()+" dollars");
	}

}
