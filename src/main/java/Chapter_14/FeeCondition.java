package Chapter_14;

import Chapter_10.Call;

import java.util.List;

public interface FeeCondition {

    List<DateTimeInterval> findTimeIntervals(Call call);
}
