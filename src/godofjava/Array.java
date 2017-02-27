package godofjava;

/**
 * Create file : ${FILE_NAME}
 * Creator : KimBangHyun
 * Create time : 2017. 2. 22. 오전 8:00
 */
public class Array {
    // 절대 변경되지 않는 값의 경우는 메소드 내 로컬변수보다는 클래스의 변수로
    String [] month = {"Janualry","February","March","April","May","June","July","August","September","October","November","December"};

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

        System.out.println("Method twoDimensionArray....");
        array.twoDimensionArray() ;

        System.out.println("Method printArrayLength....");
        array.printArrayLength() ;

        if (args.length>0) {
            for(String arg:args) {
                System.out.println(arg);
            }
        }

    }

    private void printArrayLength() {
        int monthLength = month.length;
        System.out.println("month.length = "+monthLength);

        // case 4
        int [][] twoDim4 = {{1,2,3},{4,5}};
        System.out.println("twoDim4.length = "+twoDim4.length);
        System.out.println("twoDim4[0].length = "+twoDim4[0].length);
        System.out.println("twoDim4[1].length = "+twoDim4[1].length);

        /* error ArrayIndexOutOfBoundsException
        for (int loop1=0 ; loop1<2 ; loop1++) {
            for (int loop2=0 ; loop2<3 ; loop2++) {
                System.out.println("twoDim4["+loop1+"]["+loop2+"]="+twoDim4[loop1][loop2]);
            }
        } */

        // 배열값을 loop로 print
        for (int loop1=0 ; loop1<twoDim4.length ; loop1++) {
            for (int loop2=0 ; loop2<twoDim4[loop1].length ; loop2++) {
                System.out.println("twoDim4["+loop1+"]["+loop2+"]="+twoDim4[loop1][loop2]);
            }
        }

        System.out.println("---------------");

        // 배열을 위한 for loop
        for (String tempMonth:month) {
                System.out.println(tempMonth);
        }

        // 주의 twoDim4의 1차원값은 배열임
        // but 위치를 모르겠네.. 따로 임시 변수를 두어야 함
        for (int [] tempArray:twoDim4) {
            for (int temp:tempArray) {
                System.out.println(temp);
            }
        }

        System.out.println("---------------");

        // 위치가 필요하다면,,임시변수 추가
        int count1 = 0;
        for (int [] tempArray:twoDim4) {
            int count2 = 0;
            for (int temp:tempArray) {
                System.out.println("twoDim4["+count1+"]["+count2+"]="+temp);
                count2++;
            }
            count1++;
        }
    }

    private void twoDimensionArray() {
        // case 1
        int [][] twoDim;
        twoDim = new int[2][3];

        // case 2
        int [][] twoDim2;
        twoDim2 = new int[2][];
        // twoDim2 = new int[][];  // x
        // twoDim2 = new int[][2]; // x

        // case 3
        int [][] twoDim3 = new int[2][];
        twoDim3[0] = new int[3];
        twoDim3[1] = new int[2];

        // case 4
        int [][] twoDim4 = {{1,2,3},{4,5,6}};

        // case 5 : case 4와 동일
        int [][] twoDim5 = new int [2][3];

        twoDim5 [0][0] = 1;
        twoDim5 [0][1] = 2;
        twoDim5 [0][2] = 3;
        twoDim5 [1][0] = 4;
        twoDim5 [1][1] = 5;
        twoDim5 [1][2] = 6;

    }

    // 배열을 선언하는 다른 방법
    private void otherInit() {
        int [] lottoNumbers = {5,12,23,25,38,41,2};
        /* error case
        int [] lottoNumbers2;
        lottoNumbers2 = {5,12,23,25,38,41,2};
        */

        // 절대 변경되지 않는 값의 경우는 메소드 내 로컬변수보다는 클래스의 변수로
        // but, otherInit 메소드에서만 사용하는 경우 로컬변수로.
        // String [] month = {"Janualry","February","March","April","May","June","July","August","September","October","November","December"};
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
