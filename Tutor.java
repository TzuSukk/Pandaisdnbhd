public class Tutor {
    private String name;
    private String IC;
    private String address;
    private String qualification;
    private int yearsExperience;
    private String dateJoined;
    private int yearsInCenter;

    public Tutor(String name, String IC, String address, String qualification, int yearsExperience, String dateJoined,
            int yearsInCenter) {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.qualification = qualification;
        this.yearsExperience = yearsExperience;
        this.dateJoined = dateJoined;
        this.yearsInCenter = yearsInCenter;
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

    public String getQualification() {
        return qualification;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public String getDateJoined() {
        return dateJoined;
    }

    public int getYearsInCenter() {
        return yearsInCenter;
    }
}
