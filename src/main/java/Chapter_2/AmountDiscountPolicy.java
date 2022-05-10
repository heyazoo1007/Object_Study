package Chapter_2;

public class AmountDiscountPolicy extends DiscountPolicy{

    private Money discountAmount;

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
