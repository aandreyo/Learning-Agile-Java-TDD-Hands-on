package StudentPackage.tests;

import StudentPackage.models.*;
import StudentPackage.controller.*;

import java.util.ArrayList;

public class CourseSessionTest extends  junit.framework.TestCase{
	private CourseSession courseSession1,courseSession2;
	private Student student1,student2;
	private CourseSessionController courseSessionController;
	private String dept,deptNum;
	
	
	
	public void setUp() {
		 	courseSessionController = new CourseSessionController();   
		 	courseSession1 = new CourseSession("ENGL","101");
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
}
