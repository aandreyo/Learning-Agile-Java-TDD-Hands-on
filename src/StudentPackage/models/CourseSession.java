package StudentPackage.models;

public class CourseSession {
    private String department;
    private String number;


    public CourseSession(){}

    public CourseSession(String department,String number){
        this.department=department;
        this.number=number;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "CourseSession{" +
                "department='" + department + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
