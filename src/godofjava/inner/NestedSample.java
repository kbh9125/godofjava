package godofjava.inner;

public class NestedSample {
    public static void main(String[] args) {
        NestedSample sample = new NestedSample();
        sample.makeStaticNestedObject();
        sample.makeInnerObject();
    }

    public void makeInnerObject() {
        // OuterOfInner에서 선언한 inner class는 inner를 감싸고 있는 OuterOfInner 클래스의 객체를 만들어야 함.
        OuterOfInner outer = new OuterOfInner();
        // Outer 객체를 만들어야 Inner에 접근 가능
        OuterOfInner.Inner inner = outer.new Inner();
        inner.setValue(3);
        System.out.println(inner.getValue());
    }

    public void makeStaticNestedObject() {
        // 클래스 이름 뒤에 .(점)을 써서 객체 생성
        OuterOfStatic.StaticNested staticNested = new OuterOfStatic.StaticNested();
        staticNested.setValue(3);
        System.out.println(staticNested.getValue());
    }

}
