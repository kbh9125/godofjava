package godofjava;

/**
 * Create file : ${FILE_NAME}
 * Creator : KimBangHyun
 * Create time : 2017. 2. 22. 오전 8:00
 */
public class Array {
    public static void main(String[] args) {
        Array array = new Array();

        System.out.println("Method init....");
        array.init();

        System.out.println("Method primitiveTypes....");
        array.primitiveTypes() ;

        System.out.println("Method referenceTypes....");
        array.referenceTypes() ;

        System.out.println("Method otherInit....");
        array.otherInit() ;

    }

    // 배열을 선언하는 다른 방법
    private void otherInit() {
        int [] lottoNumbers = {5,12,23,25,38,41,2};
        /* error case
        int [] lottoNumbers2;
        lottoNumbers2 = {5,12,23,25,38,41,2};
        */
    }

    // 참조 자료형 배열의 기본값 확인.
    private void referenceTypes() {
        String [] strings = new String[2];
        Array [] array = new Array[2];
        // 초기화하지 않으면 null
        strings[0] = "Please visit www.GodOfJava.com" ;
        array[0] = new Array();
        System.out.println("strings[0]="+strings[0]);
        System.out.println("strings[1]="+strings[1]);
        System.out.println("array[0]="+array[0]);
        System.out.println("array[1]="+array[1]);

        // 명시적으로 무소유 상태임을 표시하여 선언
        String [] strings2 = null ;
        // 아래와 같이 초기화하여 사용
        strings2 = new String[2];
        System.out.println("strings2[0]="+strings2[0]);
        strings2[0] = "hahaha";
        System.out.println("strings2[0]="+strings2[0]);
    }


    // 기본자료형 배열의 기본값 확인.
    private void primitiveTypes() {
        byte [] byteArray = new byte[1];
        short [] shortArray = new short[1];
        int [] intArray = new int[1];
        long [] longArray = new long[1];
        float [] floatArray = new float[1];
        double [] doubleArray = new double[1];
        char [] charArray = new char[1];
        boolean [] booleanArray = new boolean[1];

        System.out.println("byteArray[0] = " + byteArray[0]) ;
        System.out.println("shortArray[0] = " + shortArray[0]) ;
        System.out.println("intArray[0] = " + intArray[0]) ;
        System.out.println("longArray[0] = " + longArray[0]) ;
        System.out.println("floatArray[0] = " + floatArray[0]) ;
        System.out.println("doubleArray[0] = " + doubleArray[0]) ;
        System.out.println("charArray = " + charArray[0]) ;
        System.out.println("booleanArray = " + booleanArray[0]) ;

        // 배열을 그냥 출력할 경우..
        System.out.println("---------------") ;
        System.out.println("byteArray[0] = " + byteArray) ;
        System.out.println("shortArray[0] = " + shortArray) ;

    }

    // 배열에 값을 담기.
    private void init() {
        int [] lottoNumbers = new int[7];

        lottoNumbers [0] = 5;
        lottoNumbers [1] = 12;
        lottoNumbers [2] = 23;
        lottoNumbers [3] = 25;
        lottoNumbers [4] = 38;
        lottoNumbers [5] = 41;
        lottoNumbers [6] = 2;
        // error
        // lottoNumbers [9] = 9;
    }
}
