import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Create a new TuitionCenter
        System.out.print("Enter the address of the tuition center: ");
        String address = scanner.nextLine();
        System.out.print("Enter the name of the headmaster: ");
        String headMasterName = scanner.nextLine();
        System.out.print("Enter the IC of the headmaster: ");
        String headMasterIC = scanner.nextLine();

        HeadMaster headMaster = new HeadMaster(headMasterName, headMasterIC);
        TuitionCenter tuitionCenter = new TuitionCenter(address, headMaster);

        // Add tutors to the TuitionCenter
        System.out.print("Enter the number of tutors: ");
        int numTutors = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numTutors; i++) {
            System.out.printf("Enter the name of tutor %d: ", i + 1);
            String tutorName = scanner.nextLine();
            System.out.printf("Enter the IC of tutor %d: ", i + 1);
            String tutorIC = scanner.nextLine();
            System.out.printf("Enter the address of tutor %d: ", i + 1);
            String tutorAddress = scanner.nextLine();
            System.out.printf("Enter the qualification of tutor %d: ", i + 1);
            String tutorQualification = scanner.nextLine();
            System.out.printf("Enter the number of years of experience of tutor %d: ", i + 1);
            int tutorExperience = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.printf("Enter the date joined of tutor %d (DD/MM/YYYY): ", i + 1);
            String tutorDateJoined = scanner.nextLine();
            System.out.printf("Enter the number of years in the center of tutor %d: ", i + 1);
            int tutorYearsInCenter = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            Tutor tutor = new Tutor(tutorName, tutorIC, tutorAddress, tutorQualification, tutorExperience, tutorDateJoined, tutorYearsInCenter);
            tuitionCenter.addTutor(tutor);
        }


        // Add students to the TuitionCenter

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Enter the name of student %d: ", i + 1);
            String studentName = scanner.nextLine();
            System.out.printf("Enter the IC of student %d: ", i + 1);
            String studentIC = scanner.nextLine();
            System.out.printf("Enter the address of student %d: ", i + 1);
            String studentAddress = scanner.nextLine();
            System.out.printf("Enter the year of student %d: ", i + 1);
            int studentYear = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.printf("Enter the school name of student %d: ", i + 1);
            String studentSchoolName = scanner.nextLine();
            System.out.printf("Enter the number of scores of student %d: ", i + 1);
            int numScores = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            List<Integer> scores = new ArrayList<>();

            for (int j = 0; j < numScores; j++) {
                System.out.printf("Enter score %d for student %d: ", j + 1, i + 1);
                int score = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                scores.add(score);
            }

            Student student = new Student(studentName, studentIC, studentAddress, studentYear, studentSchoolName, scores);
            tuitionCenter.addStudent(student);
        }

        // Print the performance report of the TuitionCenter
        System.out.printf("Performance report for tuition center at %s:\n", tuitionCenter.getAddres());
        System.out.printf("Number of tutors: %d\n", tuitionCenter.getNumTutors());
        System.out.printf("Number of students: %d\n", tuitionCenter.getNumStudents());
        System.out.printf("Average marks: %.2f\n", tuitionCenter.getAvgMarks());
        System.out.printf("Minimum marks: %d\n", tuitionCenter.getMinMarks());
        System.out.printf("Maximum marks: %d\n", tuitionCenter.getMaxMarks());
        System.out.println("Tutor backgrounds:");
        List<String> backgrounds = tuitionCenter.getTutorBackgrounds();
        for (String background : backgrounds) {
        System.out.println(background);
        }
    }
}
