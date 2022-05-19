package Chapter_6;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class RecurringSchedule {

    private String subject;
    private DayOfWeek dayOfWeek;
    private LocalTime from;
    private Duration duration;

    public String getSubject() {
        return subject;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public LocalTime getFrom() {
        return from;
    }

    public Duration getDuration() {
        return duration;
    }

    public RecurringSchedule(String subject, DayOfWeek dayOfWeek, LocalTime from, Duration duration) {

        this.subject = subject;
        this.dayOfWeek = dayOfWeek;
        this.from = from;
        this.duration = duration;
    }

    public void askReschedule(Event event, RecurringSchedule schedule){

        if (!event.isSatisfied(schedule)){
            event.reschedule(schedule);
        }
    }
}
