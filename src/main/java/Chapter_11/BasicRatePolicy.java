package Chapter_11;

import Chapter_10.Call;
import Chapter_10.Phone;
import Chapter_2.Money;

public abstract class BasicRatePolicy implements RatePolicy{

    @Override
    public Money calculateFee(Phone_11 phone_11) {
        Money result = Money.ZERO;
        for (Call call: phone_11.getCalls()){
            result.plus(calculateCallFee(call));
        }
        return  result;
    }

    protected abstract Money calculateCallFee(Call call);

}
