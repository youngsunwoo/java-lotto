package stage2.domain;

import java.util.ArrayList;
import java.util.List;

public class LottoStore {

    private static final int TICKET_PRICE = 1000;

    LottoMaker lottoMaker = new LottoMaker();

    private int getGameCount(Money money) {
        if (money.getAmount() < TICKET_PRICE) {
            throw new IllegalArgumentException("금액이 부족합니다. 최소 구매금액은 " + TICKET_PRICE + "원 입니다");
        }

        if (money.getAmount() * 1.0 / TICKET_PRICE % 1 != 0) {
            throw new IllegalArgumentException("금액은 " + TICKET_PRICE + "원 단위로 입력해주세요");
        }
        return money.getAmount() / TICKET_PRICE;
    }


    public List<LottoTicket> sell(Money money) {
        List<LottoTicket> lottoTickets = new ArrayList<>();
        getGameCount(money);
        for (int i = 0; i < getGameCount(money); i++) {
            lottoTickets.add(new LottoTicket(lottoMaker));
        }
        return lottoTickets;
    }


}
