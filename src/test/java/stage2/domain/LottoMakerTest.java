package stage2.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoMakerTest {

    LottoMaker lottoMaker = new LottoMaker();

    @Test
    public void makeLotto(){
        List<Integer> lotto =  lottoMaker.makeLotto();
        //크기검사
        assertThat(lotto.size()).isEqualTo(6);
        //중복검사
        assertThat(lotto.stream().distinct().count()).isEqualTo(lotto.size());
    }

}
