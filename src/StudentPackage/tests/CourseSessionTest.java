package StudentPackage.tests;

import StudentPackage.models.*;
import StudentPackage.controller.*;
import java.util.*;

public class CourseSessionTest extends  junit.framework.TestCase{
	private CourseSession courseSession1,courseSession2;
	private Student student1,student2;
	private CourseSessionController courseSessionController;
	private String dept,deptNum;
	private Date startDate;
	
	public Date createDate(int year,int month,int date) {
		return new Date(year-1900,month-1,date);
	}
	
	public void setUp() {
			
			startDate = createDate(2003,1,6);
			courseSession1 = new CourseSession("ENGL","101",startDate);
		
		
		
		 	courseSessionController = new CourseSessionController();   
		 	
	        courseSession2 = new CourseSession("MATH","101");
	        
	        student1 = new Student(1,"Jane","Doe",0);
	        student2 = new Student(2,"John","Doe",0);
	        
	        courseSessionController.enrollStudent(student1);
	        courseSessionController.enrollStudent(student2);
	        
	        courseSessionController.addCourse(courseSession1);
	        courseSessionController.addCourse(courseSession2);
	        
	        dept =  courseSession1.getDepartment();
	        deptNum = courseSession1.getNumber();
	}
	

    public void testCreate(){
        
		  assertEquals("ENGL",dept);
		  assertEquals("101", deptNum);
		  assertEquals(2,courseSessionController.getNumOfStudents());
		  assertEquals(startDate,courseSession1.getStartDate());

    }


    public void testEnrolledStudents(){

        assertEquals(student1,courseSessionController.getStudents(0));
        assertEquals(student2,courseSessionController.getStudents(1));

        for(int i=0; i<courseSessionController.getNumOfCourses(); i++) {
        	System.out.println(courseSessionController.getCourses(i));
        }
        
        for(int i=0; i<courseSessionController.getNumOfStudents(); i++) {
        	System.out.println(courseSessionController.getStudents(i));
        }
    }
    
    public void testEnrolledDate() {
   
    	Date sixteenWeeksOut = createDate(2003,4,25);
    	assertEquals(sixteenWeeksOut,courseSession1.getEndDate());
    	
    	
    	
    	
    	
    	
    }	
}
