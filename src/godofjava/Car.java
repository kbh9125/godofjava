package godofjava;

public class Car {
	// ������
	public Car() {
	    System.out.println("Car Constructor");
	}
	int speed;
	int distance;
	String color;
	public void speedUp() {
		// ȣ���ϸ� speed�� 5�� �����Ѵ�.
		speed += 5 ;
	}
	public void breakDown() {
		// ȣ���ϸ� speed�� 10�� �����Ѵ�.
		speed -= 10 ;
	}
	public int getCurrentSpeed() {
		return speed;
	}
}
