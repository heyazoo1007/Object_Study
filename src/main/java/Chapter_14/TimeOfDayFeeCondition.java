package Chapter_14;

import Chapter_10.Call;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

public class TimeOfDayFeeCondition implements  FeeCondition{

    private LocalTime from;
    private LocalTime to;

    @Override
    public List<DateTimeInterval> findTimeIntervals(Call call) {
        return call.getInterval().splitByDay()
                .stream()
                .filter(each-> from(each).isBefore(to(each)))
                .map(each -> DateTimeInterval.of(
                        LocalDateTime.of(each.getFrom().toLocalDate(),from(each)),
                        LocalDateTime.of(each.getTo().toLocalDate(),to(each))))
                .collect(Collectors.toList());
    }

    private LocalTime from(DateTimeInterval interval){
        return interval.getFrom().toLocalTime().isBefore(from) ?
                from : interval.getFrom().toLocalTime();
    }
    private LocalTime to(DateTimeInterval interval){
        return interval.getTo().toLocalTime().isAfter(to) ?
                to : interval.getTo().toLocalTime();
    }
}
