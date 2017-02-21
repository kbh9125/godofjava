package godofjava;

/**
 * Create file : ${FILE_NAME}
 * Creator : KimBangHyun
 * Create time : 2017. 2. 21. 오전 8:27
 */
public class ControlOfFlow {
    public static void main(String[] args) {
        ControlOfFlow control = new ControlOfFlow() ;

        control.ifStatement();
        control.ifStatement2();
        control.ifStatement3();
        control.ifStatement4(75);
        control.switchStatement(3);

        System.out.println("Method switchStatement2...");
        control.switchStatement2(2);

        System.out.println("Method whileLoop...");
        control.whileLoop() ;

        System.out.println("Method whileLoop2...");
        control.whileLoop2() ;

        System.out.println("Method forLoop...");
        control.forLoop(10) ;
    }

    private void forLoop(int until) {
        int sum=0;
        for (int loop=1 ; loop <= until ; loop++) {
            sum += loop;
        }
        System.out.println("1 to "+until+" = "+sum);
    }

    private void whileLoop2() {
        int loop = 0;
        do {
            loop++;
            switchStatement2(loop);
        } while (loop<12);
    }

    private void whileLoop() {
        int loop = 0;
        while(loop<12) {
            loop++;
            switchStatement2(loop);
            //if(loop==6) loop = 100; // so good.
            if(loop==6) break; // nice!
        }
    }

    private void switchStatement2(int month) {
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month+" has 31 days.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month+" has 30 days.");
                break;
            case 2:
                System.out.println(month+" has 28 or 29 days.");
                break;
            default:
                System.out.println(month+" is not a month");
                break;
        }
    }

    private void switchStatement(int numberOfWheel) {
        System.out.println("Method switchStatement...");
        switch(numberOfWheel) {
            case 1:
                System.out.println("It is one foot bicycle.");
                break;
            case 2:
                System.out.println("It is a motor cycle or bicycle.");
                break;
            case 3:
                System.out.println("It is a three wheel car.");
                break;
            case 4:
                System.out.println("It is a car.");
                break;
            default:
                System.out.println("It is an expensive car.");
                break;
        }
    }

    private void ifStatement4(int point) {
        System.out.println("Method ifStatement4...");
        if(point>90) {
            System.out.println("A");
        } else if (point>80) {
            System.out.println("B");
        } else if (point>70) {
            System.out.println("C");
        } else if (point>60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    private void ifStatement3() {
        System.out.println("Method ifStatement3...");
        int age=25 ;
        boolean isMarried=true;
        if(age>25 && isMarried) {
            System.out.println("Age is over 25 & Married");
        }
        if(age>25 || isMarried) {
            System.out.println("Age is over 25 or Married");
        }
        double height = 180 ;
        if(age>25 || isMarried && height >=180) {
            System.out.println("Age is over 25 or Married and height is over 180.");
        }
    }

    private void ifStatement2() {
        System.out.println("Method ifStatement2...");
        int intValue = 10;

        if(intValue>5) System.out.println("It's bigger than 5.");
        else System.out.println("It's smaller or equal than 5.");
    }

    public void ifStatement() {
        System.out.println("Method ifStatement...");
        if(true);
        if(true) System.out.println("It's true.") ;
        if(true)
            System.out.println("It's also true.");
        if(false) System.out.println("It's false.") ;
    }
}
