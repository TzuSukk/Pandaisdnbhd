import java.util.*;

public class PandaiSdnBhd {
    private List<TuitionCenter> tuitionCenters;

    public PandaiSdnBhd() {
        this.tuitionCenters = new ArrayList<>();
    }

    public void addTuitionCenter(TuitionCenter tuitionCenter) {
        tuitionCenters.add(tuitionCenter);
    }

    public void removeTuitionCenter(TuitionCenter tuitionCenter) {
        tuitionCenters.remove(tuitionCenter);
    }

    public int getTotalNumTutors() {
        int sum = 0;
        for (TuitionCenter tuitionCenter : tuitionCenters) {
            sum += tuitionCenter.getNumTutors();
        }
        return sum;
    }

    public int getTotalNumStudents() {
        int sum = 0;
        for (TuitionCenter tuitionCenter : tuitionCenters) {
            sum += tuitionCenter.getNumStudents();
        }
        return sum;
    }

    public double getAvgMarks() {
        double sum = 0.0;
        int count = 0;
        for (TuitionCenter tuitionCenter : tuitionCenters) {
            sum += tuitionCenter.getAvgMarks() * tuitionCenter.getNumStudents();
            count += tuitionCenter.getNumStudents();
        }
        return sum / count;
    }

    public int getMinMarks() {
        int min = Integer.MAX_VALUE;
        for (TuitionCenter tuitionCenter : tuitionCenters) {
            int centerMin = tuitionCenter.getMinMarks();
            if (centerMin < min) {
                min = centerMin;
            }
        }
        return min;
    }

    public int getMaxMarks() {
        int max = Integer.MIN_VALUE;
        for (TuitionCenter tuitionCenter : tuitionCenters) {
            int centerMax = tuitionCenter.getMaxMarks();
            if (centerMax > max) {
                max = centerMax;
            }
        }
        return max;
    }

    public List<String> getTutorBackgrounds() {
        List<String> backgrounds = new ArrayList<>();
        for (TuitionCenter tuitionCenter : tuitionCenters) {
            backgrounds.addAll(tuitionCenter.getTutorBackgrounds());
        }
        return backgrounds;
    }
}