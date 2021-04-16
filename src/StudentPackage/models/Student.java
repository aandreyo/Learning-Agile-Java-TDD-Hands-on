package StudentPackage.models;

public class Student {

    private long StudentID;
    private String FirstName;
    private String LastName;
    private double Grades;


    //default constructor
    public Student(){}
    //constructor with arguments
    public Student(long studentID,String firstName,String lastName,double grades){
        this.StudentID=studentID;
        this.FirstName=firstName;
        this.LastName=lastName;
        this.Grades=grades;
    }

    public void setStudentID(long studentID) {
        this.StudentID = studentID;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public void setGrades(double grades) {
        this.Grades = grades;
    }

    public long getStudentID() {
        return StudentID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public double getGrades() {
        return Grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentID=" + StudentID +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Grades=" + Grades +
                '}';
    }
}
