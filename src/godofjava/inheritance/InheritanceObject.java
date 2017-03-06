package godofjava.inheritance;

public class InheritanceObject {
    public static void main(String[] args) {
        InheritanceObject obj = new InheritanceObject();
        System.out.println("Method toStringMethod call");
        obj.toStringMethod(obj);
        System.out.println("Method toStringMethod call2");
        obj.toStringMethod2();
    }
    public void toStringMethod(InheritanceObject obj) {
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println("plus "+obj);
    }
    public void toStringMethod2() {
        System.out.println(this);
        System.out.println(toString());
        System.out.println("plus "+this);
    }
    public String toString() {
        return "InheritanceObject class";
    }

}
