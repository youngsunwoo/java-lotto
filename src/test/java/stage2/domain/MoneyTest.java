package stage2.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class MoneyTest {

    @Test
    public void money_숫자_실패_음수() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new Money(-180);
        });
    }

    @Test
    public void money_텍스트_실패_음수() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
             new Money("-2800");
        });
    }

    @Test
    public void money_성공_숫자() {
        int amount = 2700;
        assertThat(new Money(amount).getAmount()).isEqualTo(amount);

    }

    @Test
    public void money_텍스트_성공() {
        String amount = "1500";
        assertThat(new Money(amount).getAmount()).isEqualTo(Integer.parseInt(amount));
    }
}
