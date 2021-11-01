package family2;

public class Child extends Parent {
	//int money;
	
	Child() {
		//super();// 부모의 생성자를 명시적으로 호출
		System.out.println("Child()");
	}
	Child(int money) {
		super(money);
		System.out.printf("Child(%d)\n", money);
		//this.money=money;
	}
}
