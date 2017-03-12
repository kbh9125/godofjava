package godofjava.enums;

// enum을 보다 제대로 사용하기.
public enum OverTimeValues2 {
    THREE_HOUR(18000),
    FIVE_HOUR(30000),
    WEEKEND_FOUR_HOUR(40000),
    WEEKEND_EIGHT_HOUR(60000);
    private final int amount;
    OverTimeValues2(int amount) {
        this.amount = amount;
    }
    // 생성자
    public int getAmount() {
        return amount;
    }
}
