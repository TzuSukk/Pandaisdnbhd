import java.util.List;

public class Student {
    private String name;
    private String IC;
    private String address;
    private int year;
    private String schoolName;
    private List<Integer> scores;


    //constructer
    public Student(String name, String IC, String address, int year, String schoolName, List<Integer> scores) {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.year = year;
        this.schoolName = schoolName;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public String getIC() {
        return IC;
    }

    public String getAddress() {
        return address;
    }

    public int getYear() {
        return year;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public List<Integer> getScores() {
        return scores;
    }

    public double getAvgScore() {
        if (scores.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum / scores.size();
    }

    public int getMinScore() {
        if (scores.isEmpty()) {
            return 0;
        }
        int min = scores.get(0);
        for (int score : scores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }

    public int getMaxScore() {
        if (scores.isEmpty()) {
            return 0;
        }
        int max = scores.get(0);
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }
}
