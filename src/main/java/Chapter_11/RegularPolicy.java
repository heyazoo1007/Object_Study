package Chapter_11;

import Chapter_10.Call;
import Chapter_2.Money;

import java.time.Duration;

public class RegularPolicy extends BasicRatePolicy{

    private Money amount;
    private Duration seconds;

    public RegularPolicy(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {

        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
