package stage2.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoMaker {

    private static final List<Integer> ALL_LOTTO_NUMBERS = IntStream.rangeClosed(1, 45)
            .mapToObj(i -> i)
            .collect(Collectors.toList());

    public List<Integer> makeLotto() {
        Collections.shuffle(ALL_LOTTO_NUMBERS);
        List<Integer> subList = new ArrayList<>(ALL_LOTTO_NUMBERS.subList(0, 6));
        Collections.sort(subList);
        return subList;
    }


}
