package godofjava;

/**
 * Create file : ${FILE_NAME}
 * Creator : KimBangHyun
 * Create time : 2017. 3. 3. 오전 8:40
 */
public class PublicClass {
    public static void main(String [] args) {

    }
    // 클래스를 2개 선언. 가능. package-private이기 때문에 같은 패키지 내 있는 클래스만 이 클래스의 객체를 생성하고 사용 가능
    class PublicSecondClass {

    }
}
// 이것도 가능.. but public 불가능..
//public class PublicSecondClass2 {
class PublicSecondClass2 {

}
