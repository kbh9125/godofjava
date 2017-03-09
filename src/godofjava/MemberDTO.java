package godofjava;

import java.io.OutputStream;

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
    
    public String toString() {
        return "Name=" + name + " Phone=" + phone + " eMail=" + email;
    }

//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (this ==null) return false;
//        if (getClass() != obj.getClass()) return false;
//
//        MemberDTO other = (MemberDTO) obj;
//
//        if (name == null) {
//            if (other.name != null) return false;
//        }

    // equals() 메소드나 hashCode() 메소드
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MemberDTO)) return false;

        MemberDTO memberDTO = (MemberDTO) o;

        if (privateName != null ? !privateName.equals(memberDTO.privateName) : memberDTO.privateName != null)
            return false;
        if (phone != null ? !phone.equals(memberDTO.phone) : memberDTO.phone != null) return false;
        return email != null ? email.equals(memberDTO.email) : memberDTO.email == null;
    }

    @Override
    public int hashCode() {
        int result = privateName != null ? privateName.hashCode() : 0;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
