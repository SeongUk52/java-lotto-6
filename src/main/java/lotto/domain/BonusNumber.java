package lotto.domain;

import lotto.system.SystemMessage;
import lotto.validator.BallValidator;
import lotto.view.InputView;
import lotto.view.OutputView;

public class BonusNumber {
    private final int number;

    private BonusNumber(int number) {
        validate(number);
        this.number = number;
    }

    public static BonusNumber from(int number) {
        return new BonusNumber(number);
    }

    public static BonusNumber createManual() {
        OutputView.print(SystemMessage.INPUT_BONUS_NUMBER.getMessage());
        return new BonusNumber(InputView.readInt());
    }

    private void validate(int number) {
        BallValidator.validate(number);
    }

    public int get() {
        return number;
    }
}
