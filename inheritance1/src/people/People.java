package people;

public class People {
	String name;
	int 키;
	int 몸무게;
	int 성별 ;
	int 나이 ;
	
	
	
	People (){
		this.name= "아무개";
		
	}
	public People(String name) {
		this.name=name;
	}


	public People(String name,int 키, int 몸무게, int 성별, int 나이) {
		this.name=name;
		this.키 = 키;
		this.몸무게 = 몸무게;
		this.성별 = 성별;
		this.나이 = 나이;
	}
	void speak() {
		System.out.printf("people: speak(%s)\n",this.name);
	}
	void walk() {
		System.out.printf("people: walk(%s)\n",this.name);
	}
	void run() {
		System.out.printf("people: run(%s)\n",this.name);
	}
	void work() {
		System.out.printf("people: work(%s)\n",this.name);
	}
	
}