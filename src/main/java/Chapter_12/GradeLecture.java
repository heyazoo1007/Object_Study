package Chapter_12;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class GradeLecture extends Lecture{

    private List<Grade> grades;


    public GradeLecture(int pass, String title, List<Grade> grades, List<Integer> scores) {
        super(pass, title, scores);
        this.grades=grades;
    }

    @Override
    public String evaluate(){
        return super.evaluate()+" , "+ gradesStatistic();
    }

    private String gradesStatistic(){
        return grades
                .stream()
                .map(grade -> format(grade))
                .collect(joining(" "));
    }
    private String format(Grade grade){
        return String.format("%s : %d",grade.getName(),gradeCount(grade));
    }

    private long gradeCount(Grade grade){
        return getScores()
                .stream()
                .filter(grade::include)
                .count();
    }

    public double average(String gradeName){
        return grades
                .stream()
                .filter(each -> each.isName(gradeName))
                .findFirst()
                .map(this::gradeAverage)
                .orElse(0d);
    }

    private double gradeAverage(Grade grade){
        return getScores()
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }
}
