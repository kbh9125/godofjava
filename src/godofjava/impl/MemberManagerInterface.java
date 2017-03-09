package godofjava.impl;

import godofjava.MemberDTO;

/**
 * Create file : ${FILE_NAME}
 * Creator : KimBangHyun
 * Create time : 2017. 3. 10. 오전 8:07
 */
public interface MemberManagerInterface {
    public boolean addMember(MemberDTO member);
    public boolean removeMember(String name, String phone);
    public boolean updateMember(MemberDTO member);
}
