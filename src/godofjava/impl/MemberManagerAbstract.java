package godofjava.impl;

import godofjava.MemberDTO;

/**
 * Create file : ${FILE_NAME}
 * Creator : KimBangHyun
 * Create time : 2017. 3. 10. 오전 8:23
 */
public abstract class MemberManagerAbstract {
    public abstract boolean addMember(MemberDTO member);
    public abstract boolean removeMember(String name, String phone);
    public abstract boolean updateMember(MemberDTO member);
    // 메소드를 final로 선언하면 더이상 overriding할 수 없다.
    public final void printLog(String data) {
        System.out.println("Data="+data);
    }
}