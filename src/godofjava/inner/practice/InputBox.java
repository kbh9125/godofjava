package godofjava.inner.practice;

/**
 * Create file : ${FILE_NAME}
 * Creator : KimBangHyun
 * Create time : 2017. 3. 14. 오전 8:53
 */
public class InputBox {
    public InputBox() {

    }
    KeyEventListener listener;
    public void setKeyListener(KeyEventListener listener) {
        this.listener = listener;
    }
    public static final int KEY_DOWN = 2;
    public static final int KEY_UP = 4;
    public void listenerCalled(int eventType) {
        if(eventType==KEY_DOWN) {
            listener.onKeyDown();
        } else if(eventType==KEY_UP) {
            listener.onKeyUp();
        }
    }
}
