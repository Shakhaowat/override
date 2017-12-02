package encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		Student st1=new Student();
		st1.setStName("Shakhaowat");
		st1.setStID(23137311);
		st1.setSSN("123456789");
		st1.setDOB("12-10-1987");
		
		System.out.println(st1.getStName()+" "+ st1.getStID()+" "+st1.getSSN()+" "+st1.getDOB());
		
		
	}

}
