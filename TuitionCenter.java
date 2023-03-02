import java.util.*;

public class TuitionCenter {
    private String address;
    private HeadMaster headMaster;
    private List<Tutor> tutors;
    private List<Student> students;

    public TuitionCenter(String address, HeadMaster headMaster) {
        this.address = address;
        this.headMaster = headMaster;
        this.tutors = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public String getAddres() {
        return address;
    }

    public HeadMaster setheadMaster() {
        return headMaster;
    }

    public void addTutor(Tutor tutor) {
        tutors.add(tutor);
    }

    public void removeTutor(Tutor tutor) {
        tutors.remove(tutor);
    }

    public int getNumTutors() {
        return tutors.size();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public int getNumStudents() {
        return students.size();
    }

    public double getAvgMarks() {
        if (students.size() == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (Student student : students) {
            sum += student.getAvgScore();
        }
        return sum / students.size();
    }

    public int getMinMarks() {
        if (students.size() == 0) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        for (Student student : students) {
            int studentMin = student.getMinScore();
            if (studentMin < min) {
                min = studentMin;
            }
        }
        return min;
    }

    public int getMaxMarks() {
        if (students.size() == 0) {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        for (Student student : students) {
            int studentMax = student.getMaxScore();
            if (studentMax > max) {
                max = studentMax;
            }
        }
        return max;
    }

    public List<String> getTutorBackgrounds() {
        List<String> backgrounds = new ArrayList<>();
        for (Tutor tutor : tutors) {
            backgrounds.add(tutor.getQualification());
        }
        return backgrounds;
    }
}