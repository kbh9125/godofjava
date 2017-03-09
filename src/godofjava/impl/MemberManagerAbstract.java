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
    public void printLog(String data) {
        System.out.println("Data="+data);
    }
}
