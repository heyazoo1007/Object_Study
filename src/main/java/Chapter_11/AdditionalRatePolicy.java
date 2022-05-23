package Chapter_11;

import Chapter_2.Money;

public abstract class AdditionalRatePolicy implements RatePolicy{

    private RatePolicy next;

    public AdditionalRatePolicy(RatePolicy next) {
        this.next = next;
    }

    @Override
    public Money calculateFee(Phone_11 phone_11) {
        Money fee= next.calculateFee(phone_11);
        return afterCalculated(fee);
    }

    abstract protected Money afterCalculated(Money fee);
}
