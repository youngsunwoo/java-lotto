package stage2.domain;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Optional;

public enum Ranks {
    FIRST_PLACE(6, 2000000000),
    SECOND_PLACE(5,1500000),
    THIRD_PLACE(4, 50000),
    FOUTTH_PLACE(3, 5000);

    int matchCount;
    int prize;

    Ranks(int matchCount, int prize) {
        this.matchCount = matchCount;
        this.prize = prize;
    }

    public static Optional<Ranks> of(int matchCount) {
        return Arrays.stream(values())
                .filter(v -> matchCount == v.matchCount)
                .findFirst();
    }

    public int getMatchCount() {
        return this.matchCount;
    }

    public int getPrize(){
        return this.prize;
    }
};
