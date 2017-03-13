package godofjava.inner;

/**
 * Create file : ${FILE_NAME}
 * Creator : KimBangHyun
 * Create time : 2017. 3. 14. 오전 8:39
 */
public class NestedValueReference {
    public int publicInt = 0;
    protected int protectedInt = 1;
    int justInt = 2;
    private int privateInt = 3;
    static int staticInt = 4;
    // Static Nested 클래스에서는 감싸고 있는 클래스의 static 변수만 참조할 수 있다.
    // static하지 않은 변수를 참조할 수는 없다
    static class StaticNested {
        private int staticNestedInt = 99;
        public void setValue() {
            staticInt = 14;
        }
    }
    // static nested 클래스와는 다르게 감싸고 있는 클래스의 어떤 변수라도 참조할 수 있다
    class Inner {
        private int innerValue = 100;
        public void setValue() {
            publicInt = 20;
            privateInt = 21;
            justInt = 22;
            privateInt = 23;
            staticInt = 24;
        }
    }
    public void setValue() {
        // 익명 클래스로 구현
        EventListener listener = new EventListener() {
            @Override
            public void onClick() {
               publicInt = 30;
               protectedInt = 31;
               justInt = 32;
               privateInt = 33;
               staticInt = 34;
            }
        };
    }
    public void setValue(int value) {
        // static Nested 클래스와 inner 클래스 모두 클래스내 변수를 모두 참조 가능하다
        // private도 접근 가능하다
        StaticNested nested = new StaticNested();
        nested.staticNestedInt = value;
        Inner inner = new Inner();
        inner.innerValue = value;
    }
}
