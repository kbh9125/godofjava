package godofjava.inheritance;

public class Inheritance {
	public static void main(String[] args) {
		Inheritance inheritance = new Inheritance();

	    Child child = new Child();
		child.printName();

		// 상속 관계가 성립되면 다음과 같이 객체를 생성할 수 있음
        Parent obj = new Child();

        // 거꾸로는 안된다
        // Child obj2 = new Parent();

        System.out.println("Mothod objectCast call...");
        inheritance.objectCast();

        System.out.println("Mothod objectCast2 call...");
        inheritance.objectCast2();

        System.out.println("Mothod callPrintNames call...");
        inheritance.callPrintNames();

	}

	public void objectCast() {
	    Parent parent = new Parent();
	    Child child = new Child();

	    // 자식 클래스 타입에서 부모 클래스 타입으로 형변환하면 문제가 없음
	    Parent parent2 = child;

	    // 부모 클래스 타입에서 자식 클래스 타입으로 형변환하면 안됨
	    // 명시적으로 형변환을 하면 컴파일 오류를 피할 수 있게지만 런타임에서 예외가 발생한다
	    //Child child2 = (Child) parent;

        // parent2 겉모습은 Parent 클래스의 객체인 것 처럼 보이지만 실제로는 Child 클래스의 객체.. 문제 없음
        Child child2 = (Child) parent2;
    }
    public void objectCast2() {
	    Parent[] parentArray = new Parent[3];
	    parentArray[0] = new Child();
	    parentArray[1] = new Parent();
	    parentArray[2] = new Child();

	    for(Parent tempParent:parentArray) {
	        if (tempParent instanceof Child) {
	            //System.out.println("Child");
                Child tempChild = (Child) tempParent;
                tempChild.printAge();
            } else if (tempParent instanceof Parent) {
	            System.out.println("Parent");
            }
        }

        // 주의: parentArray[0]은 Child 타입이지만 Parent 타입도 된다.
        System.out.println(parentArray[0] instanceof Parent);

	    // instancof를 사용하여 타입을 점검할때는 가장 하위에 있는 자식 타입부터 확인해야 한다
        // 전부 parent로 나온다
        for(Parent tempParent2:parentArray) {
            if (tempParent2 instanceof Parent) {
                System.out.println("Parent");
            } else if (tempParent2 instanceof Child) {
                Child tempChild = (Child) tempParent2;
                tempChild.printAge();
            }
        }
    }

    public void callPrintNames() {
	    // 선언시에는 모두 Parent 타입으로 선언했지만 실제 메소드 호출된 것은 생성자를 사용한 클래스에 있는 것이 호출..
        // Polymorphism : 형 변환을 하더라도 실제 호출되는 것은 원래 객체에 있는 메소드가 호출
	    Parent parent1 = new Parent();
	    Parent parent2 = new Child();
	    Parent parent3 = new ChildOther();

	    parent1.printName();
	    parent2.printName();
	    parent3.printName();
    }

}