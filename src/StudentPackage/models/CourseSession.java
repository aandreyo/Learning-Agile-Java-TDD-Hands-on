package StudentPackage.models;
import java.util.*;



public class CourseSession {
    private String department;
    private String number;
    private Date startDate;


    public CourseSession(){}

    public CourseSession(String department,String number){
        this.department=department;
        this.number=number;
    }
    public CourseSession(String department,String number,Date startDate) {
    	this.department=department;
    	this.number=number;
    	this.startDate=startDate;
    }
    public Date getStartDate() {
    	return startDate;
    }
    
    public Date getEndDate() {
    	final int sessionLength = 16, daysInWeek = 7, daysFromFridayToMonday = 3;
    	GregorianCalendar calendar = new GregorianCalendar();
    	calendar.setTime(startDate);
    	int numberOfDays = sessionLength * daysInWeek  - daysFromFridayToMonday; 
    	calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
    	return calendar.getTime();
    	
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
		return "CourseSession [department=" + department + ", number=" + number + ", startDate=" + startDate + "]";
	}
}
