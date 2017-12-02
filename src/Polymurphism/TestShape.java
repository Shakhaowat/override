package Polymurphism;

public class TestShape {

	public static void main(String[] args) {
		Shape S =new Shape();
		
		System.out.println("The area is:"+S.areaOfaLand(20.5, 20));
		
		OverideShape R=new OverideShape();
		System.out.println("The area is: "+R.areaOfaLand(20.5, 20));
		

	}

}
