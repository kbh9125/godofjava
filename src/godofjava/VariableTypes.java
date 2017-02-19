package godofjava;

public class VariableTypes {
	// 객체가 생성될 때 생명이 시작되고, 객체를 참조하고 있는 다른 객체가 없으면 소멸
	int instanceVariable;
	// 클래스가 생성될 때 생명이 시작되고, 자바 프로그램이 끝날 때 소멸
	static int classVariable;
	// 매개 변수 : 메소드가 호출될 때 생명이 시작되고, 메소드가 끝나면 소멸
	public void method(int parameter) {
		// 지역변수를 선언한 중괄호 내에서만 유효
		int localVariable;
	}
	public void anothermethod() {
		// 다른 중괄호에 있으므로 서로 다른 값을 나타내는 다른 변수
		int localVariable;
	}
}
