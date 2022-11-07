package stage2.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LottoTicket {

    private final List<Integer> lottoNumbers;

    public LottoTicket(final LottoMaker lottoMaker) {
        this.lottoNumbers = lottoMaker.makeLotto();
    }

    public LottoTicket(List<Integer> lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public int checkMatched(final LottoTicket winningNumbers) {
        return (int) winningNumbers.lottoNumbers.stream()
                .mapToInt(num -> num)
                .filter(lottoNumbers::contains)
                .count();
    }

    public List<Integer> getLottoTicketNumbers() {
        return List.copyOf(lottoNumbers);
    }

    @Override
    public String toString() {
        lottoNumbers.forEach(System.out::println);
        return "[" +
                this.lottoNumbers
                        .stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", ")) +
                "]";
    }
}
