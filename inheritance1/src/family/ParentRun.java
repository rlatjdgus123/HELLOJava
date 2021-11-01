package family;

public class ParentRun {

	public static void main(String[] args) {
		Parent p1= new Parent();
		Parent p2= new Parent(900);
		Parent p3= new Parent("2000");
		
		p1.print("p1");
		p2.print("02");
		p3.print();
		
		

	}

}
