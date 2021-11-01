package people;

public class PeopleRun2 {
	public static void main(String [] args) {
		
		Brother brother= new Brother("공주");
		Sister sister = new Sister("돌쇠");
		
		brother.work();
		sister.work();
		sister.childbirth(5);
		sister.childbirth(5);
		
		brother.hunt();
		
		}
}
