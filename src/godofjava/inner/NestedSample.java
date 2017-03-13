package godofjava.inner;

public class NestedSample {
    public static void main(String[] args) {
        NestedSample sample = new NestedSample();
        sample.makeStaticNestedObject();
        sample.makeInnerObject();
        sample.setButtonListener();
        sample.setButtonListener2();
        sample.setButtonListener3();
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

    // EventListner 인터페이스를 내부 클래스로 구현한 방법..
    class MagicButtonListener implements EventListener {
        public void onClick() {
            System.out.println("Magic Button Clicked!!!");
        }
    }

    public void setButtonListener() {
        MagicButton button = new MagicButton();
        MagicButtonListener listner = new MagicButtonListener();
        // EventListner 인터페이스를 구현한 MagicButtonListner의 객체를 매개변수로 넘겨줌
        button.setListener(listner);
        button.onClickProcess();
    }

    // EventListener 인터페이스를 익명 클래스로 구현한 방법..1
    public void setButtonListener2() {
        MagicButton button = new MagicButton();
//       MagicButtonListener listner = new MagicButtonListener();
//       button.setListener(listner);
        button.setListener(new EventListener() {
           @Override
           public void onClick() {
               System.out.println("Magic Button Clicked !!!");
           }
        });
        button.onClickProcess();
    }
    // EventListener 인터페이스를 익명 클래스로 구현한 방법..2
    public void setButtonListener3() {
        MagicButton button = new MagicButton();
//        MagicButtonListener listner = new MagicButtonListener();
//        button.setListener(listner);
        EventListener listener = new EventListener() {
            @Override
            public void onClick() {
                System.out.println("Magic Button Clicked !!!");
            }
        };
        button.setListener(listener);
        button.onClickProcess();
    }

}
