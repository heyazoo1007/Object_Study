package Chapter_11;

import Chapter_10.Phone;
import Chapter_2.Money;

public interface RatePolicy {

    Money calculateFee(Phone_11 phone_11);
}
