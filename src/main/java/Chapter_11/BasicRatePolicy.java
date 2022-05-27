package Chapter_11;

import Chapter_10.Call;
import Chapter_14.FeeRule;
import Chapter_2.Money;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class BasicRatePolicy implements RatePolicy{

    private List<FeeRule> feeRules = new ArrayList<>();

    public BasicRatePolicy(FeeRule ...feeRules) {
        this.feeRules = Arrays.asList(feeRules);
    }

    @Override
    public Money calculateFee(Phone_11 phone_11) {
        Money result = Money.ZERO;
        for (Call call: phone_11.getCalls()){
            result.plus(calculateCallFee(call));
        }
        return  result;
    }

    private Money calculate(Call call){
        return feeRules
                .stream()
                .map(rule-> rule.calculateFee(call))
                .reduce(Money.ZERO,(first,second)-> first.plus(second));
    }

    protected abstract Money calculateCallFee(Call call);

}
