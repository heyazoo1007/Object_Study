package Chapter_8;

import Chapter_2.DiscountPolicy;
import Chapter_2.Money;
import Chapter_2.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
