package godofjava.exception;

/**
 * Created by LG on 2017-03-19.
 */
public class Calculator2 {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
//        calc.printDivide(1,2);
//        calc.printDivide(1,0);
        try {
            calc.printDevide2(1,2);
            calc.printDevide2(1,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printDivide(double d1, double d2) {
        try {
            if(d2==0) {
                throw new Exception("Second value can't be Zero");
            }
            double result = d1 / d2;
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private  void printDevide2(double d1, double d2) throws Exception {
        try {
            if (d2 == 0) {
                throw new Exception("Second value can't be Zero");
//                System.out.println("Second value can't be Zero");
            }
            double result = d1 / d2;
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
