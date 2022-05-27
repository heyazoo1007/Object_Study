package Chapter_10;

import Chapter_14.DateTimeInterval;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Call {


    private DateTimeInterval interval;

    public Call(LocalDateTime from ,LocalDateTime to){
        this.interval = DateTimeInterval.of(from, to);

    }

    public List<DateTimeInterval> splitByDay(){
        return interval.splitByDay();
    }

    public Duration getDuration(){
        return interval.duration();
    }

    public LocalDateTime getFrom(){
        return interval.getFrom();
    }

    public LocalDateTime getTo(){
        return interval.getTo();
    }

    public DateTimeInterval getInterval(){
        return interval;
    }
}
