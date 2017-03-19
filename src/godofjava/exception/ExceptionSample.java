package godofjava.exception;

/**
 * Created by LG on 2017-03-19.
 */
public class ExceptionSample {
    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        sample.arrayOutOfBounds();
//        sample.finallySample();
//        sample.multiCatch();
//        sample.throwable();
//        sample.throwException(13);
        // throws 구문으로 선언되어 있는 메소드를 호출한 메소드에서 try-catch로 그 호출 부분을 감싸야 한다.
//        try {
//            sample.throwException2(13);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        sample.multiThrow();
//        try {
//            sample.throwException3(13);
//        } catch (MyException e) {
//            e.printStackTrace();
//        }
    }

    private void arrayOutOfBounds() {
        int[] intArray = new int[5];
        try {
            // 예외가 발생하는 부분만 try-catch로 묶어 줘도 문제되지 않는다.
//            int[] intArray = new int[5];
            System.out.println(intArray[5]);
            // 예외 발생 이후 코드는 실행되지 않는다.
            System.out.println("This code should run.");
        } catch (Exception e) {
//            System.out.println("Exception occured.");
            System.out.println(intArray.length);
        }
        System.out.println("This code should run.2");
    }

    public void finallySample() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[4]);
        } catch (Exception e) {
            System.out.println(intArray.length);
        } finally {
            System.out.println("Here is finally");
        }
        System.out.println("This code should run.3");
    }

    public void multiCatch() {
        int[] intArray = new int[5];
        try {
            intArray = null;
            System.out.println(intArray[5]);
//        } catch (NullPointerException e) {
//            System.out.println("NullPointerException");
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(intArray.length);
            System.out.println("ArrayIndexOutOfBoundsExceoption occured");
        } catch (Exception e) {
            System.out.println("Excetion occured");
        }
    }

    // 모든 예외의 할아버지는 java.lang.Throwable 클래스이다.
    public void throwable() {
        int[] intArray = new int[5];
        try {
//            intArray = null;
            System.out.println(intArray[5]);
        } catch(Throwable t) {
//            System.out.println(t.getMessage());
        }
    }
    public void throwException(int number) {
        try {
            if (number>12) {
                throw new Exception("Number is over than 12");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void throwException2(int number) throws Exception {
       if (number>12) {
           throw new Exception("Number is over than 12");
       }
    }

    // 두개이상의 예외가 발생가능한 상황에서는 다음과 같이 throws에 두개이상의 예외를 나열하면 된다.
    public void multiThrow() throws NullPointerException, ArrayIndexOutOfBoundsException {
        int[] intArray = new int[5];
        intArray=null;
        System.out.println(intArray[5]);
    }

    public void throwException3(int number) throws MyException {
        try {
            if (number>12) {
                throw new MyException("Nymber is over than 12 hahah!");
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
