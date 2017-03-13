package godofjava.inner;

/**
 * Created by LG on 2017-03-13.
 */
public class OuterOfInner {
    class Inner {
        private int value = 0;
        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
    }
}
