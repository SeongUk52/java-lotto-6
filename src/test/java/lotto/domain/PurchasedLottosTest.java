package lotto.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PurchasedLottosTest {

    @DisplayName("로또 구매기능 테스트")
    @Test
    void createPurchasedLottosByMoney() {
        assertThat(PurchasedLottos.from(Money.from(5000)))
                .isInstanceOf(PurchasedLottos.class);
    }
}
