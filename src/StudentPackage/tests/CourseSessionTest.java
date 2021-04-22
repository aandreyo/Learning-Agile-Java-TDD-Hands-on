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
	
	
	public void setUp() {
			int year = 103;
			int month = 0;
			int date = 6;
			startDate = new Date(year,month,date);
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
    	int year = 103;
    	int month =3;
    	int date = 25;
    	Date sixteenWeeksOut = new Date(year,month,date);
    	assertEquals(sixteenWeeksOut,courseSession1.getEndDate());
    	
    	
    	
    	
    	
    	
    }	
}
