package godofjava.impl;

public class FinalVariable {
    //변수 생성과 동시에 초기화해야만 한다.
//    final int instanceVariable;
    final int instanceVariable=1;
    
    // 매개변수나 지역변수에 final 적용 -> 선언할 때 반드시 초기화할 필요는 없다.
    // 매개 변수는 이미 초기화되서 넘어 왔고, 지역변수는 선언하는 중괄호 내에서만 참조되므로 다른 곳에서 변경할 일이 없다.
    // final 변수에 값을 다시 할당하면 안된다.
    public void method(final int parameter) {
        final int localVariable;
        localVariable = 2;
        // erro
//        localVariable = 3;
//        parameter=4;
    }

}
