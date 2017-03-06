package godofjava.inheritance;

public class Cat extends Animal {
    String catVariable;
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.move();
    }
    public void move() {
        System.out.println("Method Cat move overriding");
    }
    public void eatFood() {
        System.out.println("Method Cat eatFood overriding");
    }
}
