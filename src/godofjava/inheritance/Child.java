package godofjava.inheritance;

public class Child extends Parent {
	public Child() {
		// Parent 클래스의 생성자중 null을 매개 변수로 받을 수 있는 생성자를 찾는다.
		//super(null);
		System.out.println("Child Construnctor");
	}
	public Child(String name) {
		// super() 는 반드시 생성자의 첫줄에 있어야 한다.
		// super(name);
		System.out.println("Child(String) Constructor");
	}
	public void printName() {
		System.out.println("printName() - Child");
	}
	// Child에만 존재하는 메소드..
	public void printAge() {
	    System.out.println("printAge() - 18 month");
    }

}
