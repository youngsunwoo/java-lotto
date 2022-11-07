package stage2.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoTicketTest {

    @Test
    public void lotto_first_place(){
        LottoTicket lottoTicket = new LottoTicket(Arrays.asList(1,5,7,13,27,32));
        LottoTicket winningNumbers = new LottoTicket(Arrays.asList(1,5,7,13,27,32));

        assertThat(lottoTicket.checkMatched(winningNumbers)).isEqualTo(6);
    }

    @Test
    public void lotto_second_place(){
        LottoTicket lottoTicket = new LottoTicket(Arrays.asList(1,5,7,13,19,27));
        LottoTicket winningNumbers = new LottoTicket(Arrays.asList(1,5,7,13,19,35));

        assertThat(lottoTicket.checkMatched(winningNumbers)).isEqualTo(5);
    }

    @Test
    public void lotto_third_place(){
        LottoTicket lottoTicket = new LottoTicket(Arrays.asList(1,5,7,13,19,27));
        LottoTicket winningNumbers = new LottoTicket(Arrays.asList(1,5,7,13,34,35));

        assertThat(lottoTicket.checkMatched(winningNumbers)).isEqualTo(4);
    }

    @Test
    public void lotto_forth_place(){
        LottoTicket lottoTicket = new LottoTicket(Arrays.asList(1,5,7,13,19,27));
        LottoTicket winningNumbers = new LottoTicket(Arrays.asList(1,5,7,1,33,34,35));

        assertThat(lottoTicket.checkMatched(winningNumbers)).isEqualTo(4);
    }
}
