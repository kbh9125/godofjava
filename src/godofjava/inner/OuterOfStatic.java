package godofjava.inner;

public class OuterOfStatic {
    // static 선언을 하면 Static Nested 클래스...
    static class StaticNested {
        private int value=0;
        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
    }

}
