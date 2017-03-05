package godofjava;

/**
 * Create file : ${FILE_NAME}
 * Creator : KimBangHyun
 * Create time : 2017. 2. 28. 오전 7:51
 */
public class MemberDTO {
    public static String name ;
    private String privateName ;
    public String phone ;
    public String email ;

    // Constructor...
    // 아무 정보도 모를 때
    public MemberDTO() {

    }

    // 이름만 알 때
    public MemberDTO(String privateName) {
        // this : 이 객체
        this.name = name ;
    }

    // 이름, 전화번호만 알 때
    public MemberDTO(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // 이름, 전화번호,email 알 때
    public MemberDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public MemberDTO getMemberDTO() {
        MemberDTO dto = new MemberDTO();
        return dto;
    }

    public static void staticMethod() {
        System.out.println("This is a static method.");
        // static 메소드는 static 변수만을 사용할 수 있다... name은 인스턴스 변수..
        // System.out.println(name);
    }

    public String getName() {
        return privateName;
    }
    
}
