package godofjava.enums;

public class OverTimeManager {
    public int getOverTimeAmount(OverTimeValues value) {
        int amount = 0;
        System.out.println(value);
        switch(value) {
        case THREE_HOUR:
            amount = 18000;
            break;
        case FIVE_HOUR:
            amount = 30000;
            break;
        case WEEKEND_FOUR_HOUR:
            amount = 40000;
            break;
        case WEEKEND_EIGHT_HOUR:
            amount = 60000;
            break;
        }
        return amount;
    }
    public static void main(String [] args) {
        OverTimeManager manager = new OverTimeManager();
        //별도의 생성자도 필요 없음.
        //enum 타입을 넘겨서 항상 switch로 확인
        System.out.println("OverTimeValues");
        int myAmount = manager.getOverTimeAmount(OverTimeValues.THREE_HOUR);
        System.out.println(myAmount);
        
        // enum 클래스 선언시 각 상수의 값을 지정...
        System.out.println("OverTimeValues2");
        OverTimeValues2 value2 = OverTimeValues2.FIVE_HOUR;
        System.out.println(value2);
        System.out.println(value2.getAmount());
        
        OverTimeValues2 value3=OverTimeValues2.THREE_HOUR;
        // 매개변수로 enum 타입과의 순서(ordinal) 차이를 리턴하다.
        System.out.println(value2.compareTo(value3));
        
        OverTimeValues2 [] valueList = OverTimeValues2.values();
        for(OverTimeValues2 value:valueList) {
            System.out.println(value);
        }
    }

}
