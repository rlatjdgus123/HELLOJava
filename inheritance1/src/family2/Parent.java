package family2;

public class Parent {
	int money = 100;
	int asset = 0 ;
	
	Parent(){
		}
	
	Parent(int money){
		this.money = money;
	}
	
	Parent(String money){
		this.money = Integer.parseInt(money);
	}
	
	void print(String title) {
	System.out.printf("Parent(%s) : money(%d)\n", title, this.money);
	}
	int print() {
		System.out.printf("Parent(notitle) :print() money(%d)\n", this.money);
		return this.money;
	}
	boolean eqObject(Parent parent) {
		return(this==parent);
	}
	boolean eqMoney(Parent parent) {
		return(this.money==parent.money);
		
	}
	boolean eqAsset(Parent parent) {
		return (this.asset == parent.asset);
	}
}
