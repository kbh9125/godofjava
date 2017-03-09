package godofjava.inheritance;

import godofjava.MemberDTO;

public class InheritanceObject {
    public static void main(String[] args) {
        InheritanceObject obj = new InheritanceObject();

        System.out.println("Method toStringMethod call");
        obj.toStringMethod(obj);

        System.out.println("Method toStringMethod2 call");
        obj.toStringMethod2();

        System.out.println("Method equalMethod call");
        obj.equalMethod();
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
    // toString() overriding...
//    public String toString() {
//        return "InheritanceObject class";
//    }
    public void equalMethod() {
        MemberDTO obj1 = new MemberDTO("Sangmin");
        MemberDTO obj2 = new MemberDTO("Sangmin");
        // 두 객체는 각각의 생성자를 사용하여 만들었기 때문에 주소값이 다르다
        // equals() 메소드를 사용하여 비교
        // but.. equals() Overriding하지 않으면 equals() 메소드는 hashCode() 값 비교
        // hashCode() 값은 해당객체의 주소값을 리턴.
        if(obj1==obj2) {
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }
        if(obj1.equals(obj2)) {
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }

    }

}
