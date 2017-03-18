package godofjava.inner.practice;

/**
 * Create file : ${FILE_NAME}
 * Creator : KimBangHyun
 * Create time : 2017. 3. 14. 오전 8:58
 */
public class MyPage {
    InputBox input ;
    public static void main(String[] args) {
        MyPage myPage = new MyPage();
        myPage.setUI();
        myPage.pressKey();
    }
    public void setUI() {
       this.input = new InputBox();
       KeyEventListener listener = new KeyEventListener() {
           @Override
           public void onKeyDown() {
               System.out.println("Key Down");
           }

           @Override
           public void onKeyUp() {
               System.out.println("Key Up");
           }
       };
       input.setKeyListener(listener);
    }
    public void pressKey() {
        input.listenerCalled(InputBox.KEY_DOWN);
        input.listenerCalled(InputBox.KEY_UP);
    }
}
