package godofjava.exception;

/**
 * Created by LG on 2017-03-19.
 */
public class ExceptionSample {
    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        sample.arrayOutOfBounds();
        sample.finallySample();
        sample.multiCatch();
        sample.throwable();
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

    public void throwable() {
        int[] intArray = new int[5];
        try {
            intArray = null;
            System.out.println(intArray[5]);
        } catch(Throwable t) {
            System.out.println(t.getMessage());
        }
    }
    public void throwExeption(int number) {
        try {
            if (number>12) {
                throw new Exception("Number is over than 12");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
