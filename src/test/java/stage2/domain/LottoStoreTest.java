package stage2.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class LottoStoreTest {

    LottoStore lottoStore = new LottoStore();

    @Test
    public void sellLotto_성공() {
        Money money = new Money(1000);
        List<LottoTicket> lottoTickets = lottoStore.sell(money);
        assertThat(lottoTickets.size()).isEqualTo(1);
    }

    @Test
    public void sellLotto_금액부족() {
        Money money = new Money(800);
        assertThatIllegalArgumentException().isThrownBy(() -> {
            List<LottoTicket> lottoTickets = lottoStore.sell(money);
        });
    }

    @Test
    public void sellLotto_잔돈존재() {
        Money money = new Money(14500);
        assertThatIllegalArgumentException().isThrownBy(() -> {
            List<LottoTicket> lottoTickets = lottoStore.sell(money);
        });
    }

}
