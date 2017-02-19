package godofjava;

public class Car {
	// 생성자
	public Car() {
	    System.out.println("Car Constructor");
	}
	int speed;
	int distance;
	String color;
	public void speedUp() {
		// 호출하면 speed는 5씩 증가한다.
		speed += 5 ;
	}
	public void breakDown() {
		// 호출하면 speed는 10씩 감소한다.
		speed -= 10 ;
	}
	public int getCurrentSpeed() {
		return speed;
	}
}
