package godofjava.inheritance;

public class Dog extends Animal {
    String dogVariable;
    public void move() {
        System.out.println("Method Dog move overriding");
    }
    public void eatFood() {
        System.out.println("Method Dog eatFood overriding");
    }
}
