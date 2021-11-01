package family3;

public class Child extends Parent {
	int money=0;
	int estate= 3000;
	Child() {
		
		System.out.println("Child()");
	}
	Child(int money) {
		
		
		this.money=money;
		System.out.printf("Child(%d): this.money=%d\n", money,this.money);
	}/*
	*메소드 재정의(method overriding)
	*-부모의 메소드 형식과 동일하게 이름과 파라미터를 정의(재정의)
	*-자신의 필드값을 참조하게 된다.
	*/
	void print(String title) {
		System.out.printf("Parent(%s) : money(%d),estate(%d)\n", title, this.money,this.estate);
		}

		void printTotal() {
			int total= this.money+this.estate+super.money+super.asset;
			
			System.out.printf(">>>나의 총 자신<<<\n");
			System.out.printf("\t자신의 현금(%d)\n" , this.money);
			System.out.printf("\t자신의 부동산(%d)\n", this.estate);
			System.out.printf("\t상속받은 현금(%d)\n",super.money);
			System.out.printf("\t상속받은 금융자신(%d)\n",super.asset);
			System.out.printf("\t------------------------------------------\n");
			System.out.printf("\t 상속받은 총자산(%d)\n", total);
			
			
			
			
			
			
			
	}
}
