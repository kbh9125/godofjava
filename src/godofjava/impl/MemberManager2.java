package godofjava.impl;

import godofjava.MemberDTO;

/**
 * Create file : ${FILE_NAME}
 * Creator : KimBangHyun
 * Create time : 2017. 3. 10. 오전 8:27
 */
public class MemberManager2 extends MemberManagerAbstract {
    public boolean addMember(MemberDTO member) {
        return false;
    }

    public boolean removeMember(String name, String phone) {
        return false;
    }

    public boolean updateMember(MemberDTO member) {
        return false;
    }

    // final 메소드를 변경하지 못하도록 final로 만들어주면 override할 수 없다.
//    public final void printLog(String data) {
//        System.out.println("Data="+data);
//    }
}
