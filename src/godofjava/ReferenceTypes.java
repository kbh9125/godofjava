package godofjava;

/**
 * Create file : ${FILE_NAME}
 * Creator : KimBangHyun
 * Create time : 2017. 2. 28. 오전 7:43
 */
public class ReferenceTypes {
    // 생성자를 수동 선언할 경우 자동으로 만들어지지 않는다
    public ReferenceTypes() {

    }
    // String 하나를 매개 변수로 사용하는 생성자
    public ReferenceTypes(String data) {

    }
    public static void main(String [] args) {
        // 우측이 생성자.
        ReferenceTypes reference = new ReferenceTypes();

        System.out.println("Method makeMemberObject....");
        reference.makeMemberObject();

        System.out.println("Method checkMemberDTOName....");
        reference.checkMemberDTOName();

        System.out.println("Method callPassByValue....");
        reference.callPassByValue();

        System.out.println("Method calculateNumbers....");
        reference.calculateNumbers(1,2,3,4,5);

        System.out.println("Method arbitrary....");
        reference.arbitrary("aaa",1,2,3);
        
        System.out.println("Method makeStaticBlockObject....");
        reference.makeStaticBlockObject();

    }
    
    // 매개변수를 지정하는 특이한 방법
    // private void calculateNumbers(int [] numbers) {
    private void calculateNumbers(int ... numbers) {
        int total = 0;
        for(int number:numbers) {
            total += number;
        }
        System.out.println("Total="+total);

    }

    // 매개변수를 지정하는 특이한 방법
    // private void calculateNumbers(int [] numbers) {
    private void calculateNumbers(int ... numbers) {
        int total = 0;
        for(int number:numbers) {
            total += number;
        }
        System.out.println("Total="+total);
    }

    // ... 는 가장 마지막에 선언해야 한다
    private void arbitrary(String message, int ... numbers) {

    }

    private void callPassByValue() {
        int a = 10;
        String b = "b";
        MemberDTO member = new MemberDTO("Sanmain");
        passByValue(a,b,member);
        System.out.println("callPassByValue method result !!!");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("member.name="+member.name);
    }

    private void passByValue(int a, String b, MemberDTO member) {
        // 기본자료형은 무조건 Pass by vlaue
        a=20;
        b="z";

        String c="c";
        // String c = new String("c"); 과 동일
        c="z";
        // c = new String("z"); 과 동일

        //member = new MemberDTO("SungChoon");
        // 참조자료형의 Pass by value
        member.name = "BangHyun";
        System.out.println("PassByValue method result !!!");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("member.name="+member.name);
    }

    // ... 는 가장 마지막에 선언해야 한다
    private void arbitrary(String message, int ... numbers) {

    }

    private void callPassByValue() {
        int a = 10;
        String b = "b";
        MemberDTO member = new MemberDTO("Sanmain");
        passByValue(a,b,member);
        System.out.println("callPassByValue method result !!!");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("member.name="+member.name);
    }

    private void passByValue(int a, String b, MemberDTO member) {
        // 기본자료형은 무조건 Pass by vlaue
        a=20;
        b="z";

        String c="c";
        // String c = new String("c"); 과 동일
        c="z";
        // c = new String("z"); 과 동일

        //member = new MemberDTO("SungChoon");
        // 참조자료형의 Pass by value
        member.name = "BangHyun";
        System.out.println("PassByValue method result !!!");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("member.name="+member.name);
    }

    private void makeStaticBlockObject() {
    	System.out.println("Creating block1");
    	StaticBlock block1 = new StaticBlock();
    	System.out.println("Created block1");
    	System.out.println("Creating block2");
    	StaticBlock block2 = new StaticBlock();
    	System.out.println("Created block2");

	}
	public void checkMemberDTOName() {
		System.out.println("data="+StaticBlock.getData());
        MemberDTO dto1 = new MemberDTO("BangHyun");
        System.out.println(dto1.name);
        MemberDTO dto2 = new MemberDTO("Sungchoon");
        // name 변수를 static으로 선언하였다.. dto2객체를 생성하고 name을 초기화 할때 Sungchoon으로 바뀐다
        System.out.println(dto1.name);
		System.out.println("data="+StaticBlock.getData());
    }

    public void makeMemberObject() {
        MemberDTO dto1 = new MemberDTO();
        // 매개변수를 가진 생성자 사용
        //MemberDTO dto2 = new MemberDTO("BangHyun");
        MemberDTO dto2 = new MemberDTO("BangHyun");
        MemberDTO dto3 = new MemberDTO("BangHyun","01012345678");
        MemberDTO dto4 = new MemberDTO("BangHyun","01012345678","b.h.kim@hyundaicard.com");
    }

    // overloading...1
    public void print(int data) {

    }

    // overloading...2
    public void print(String data) {

    }

    // overloading...3
    public void print(int intData, String stringData) {

    }

    // overloading...4
    public void print(String stringData, int intData) {

    }

    // 메소드에서 값 넘겨주기
    public int intReturn() {
        int returnInt = 0;
        return returnInt;
    }

    // 메소드에서 값 넘겨주기
    public int[] intArrayReturn() {
        int [] returnArray = new int[10];
        return returnArray;
    }

    // 메소드에서 값 넘겨주기
    public String stringReturn() {
        String returnString = "Return value";
        return returnString;
    }

    // 메소드에서 값 넘겨주기
    public int intReturn2() {
        int returnInt = 0;
        if (returnInt == 0) {
            return ++returnInt;
        } else {
            return --returnInt;
        }
    }

    // 원하는 코드만 실행
    public void wantToStopInTheMiddle(boolean flag) {
        // code...
        // 가독성을 위해 중괄호 최소화. else 절을 없앴다
        if(flag) return;

        // false 인경우 나머지 코드 실행
    }

}
