package godofjava.impl;

import godofjava.MemberDTO;

public final class FinalClass {
    final MemberDTO dto = new MemberDTO();
    public static void main(String [] args) {
        FinalClass cls = new FinalClass();
        cls.checkDTO();
    }
    public void checkDTO() {
       System.out.println(dto); 
//       dto=new MemberDTO();
       dto.name = "Sangmin";
       System.out.println(dto); 
    }

}
