package stage2.domain;

public class Money {
    int amount;

    public Money(String input) {
        try {
            this.amount = new Money(Integer.parseInt(input)).getAmount();
        } catch (NumberFormatException e) {
            throw new NumberFormatException("입력값이 정수가 아닙니다.");
        }
    }

    public Money(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("금액은 음수일 수 없습니다.");
        }
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
