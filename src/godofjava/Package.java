package godofjava;

import godofjava.sub.Sub;
// *를 활용하여 여러개 import
//import godofjava.sub.*;

// static 변수나 메소드 앞에 클래스 이름을 지정하지 않아도 된다.. 아래 처럼 선언하면..
import static godofjava.sub.Sub.subClassStaticMethod;
import static godofjava.sub.Sub.CLASS_NAME;
// or
//import static godofjava.sub.Sub.*;

/**
 * Create file : ${FILE_NAME}
 * Creator : KimBangHyun
 * Create time : 2017. 3. 3. 오전 8:04
 */
public class Package {
    public static void main(String [] args) {
        System.out.println("Package class.");

        // Sub class 접근
        Sub sub = new Sub();
        sub.subClassMethod();

        // static 변수 & 메소드 접근.. case1
        System.out.println("static var & class access.");
        Sub.subClassStaticMethod();
        System.out.println(Sub.CLASS_NAME);

        // static 변수 & 메소드 접근.. case2 import static 선언
        System.out.println("static var & class access.2");
        subClassStaticMethod();
        System.out.println(CLASS_NAME);

        sub.publidMethod();
//        sub.protectedMethod();
//        sub.packagePrivateMethod();
//        sub.privateMethod();
    }
}
