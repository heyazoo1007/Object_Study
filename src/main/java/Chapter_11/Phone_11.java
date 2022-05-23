package Chapter_11;

import Chapter_10.Call;
import Chapter_2.Money;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Phone_11 {

    private RatePolicy ratePolicy;
    private List<Call> calls = new ArrayList<>();

    public Phone_11(RatePolicy ratePolicy) {
        this.ratePolicy = ratePolicy;
    }

    public List<Call> getCalls(){
        return Collections.unmodifiableList(calls);
    }

    public Money calculateFee(){
        return ratePolicy.calculateFee(this);
    }
}
