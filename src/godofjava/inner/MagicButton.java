package godofjava.inner;

/**
 * Create file : ${FILE_NAME}
 * Creator : KimBangHyun
 * Create time : 2017. 3. 14. 오전 7:51
 */
public class MagicButton {
    public MagicButton() {

    }
    private EventListener listener;
    public void setListener(EventListener listener) {
        this.listener = listener;
    }
    public void onClickProcess() {
        if(listener!=null) {
            listener.onClick();
        }
    }
}
