package StudentPackage.tests;

import StudentPackage.models.*;
import StudentPackage.controller.*;

import java.util.ArrayList;

public class CourseSessionTest extends  junit.framework.TestCase{

    public void testCreate(){
        CourseSession courseSession = new CourseSession("ENGL","101");
        CourseSessionController courseSessionController = new CourseSessionController();
        String dept =  courseSession.getDepartment();
        String deptNum = courseSession.getNumber();

        assertEquals("ENGL",dept);
        assertEquals("101", deptNum);
        assertEquals(0,courseSessionController.getNumOfStudents());

    }


    public void testEnrolledStudents(){
        CourseSessionController courseSessionController = new CourseSessionController();
        ArrayList<Student> totalStudents = courseSessionController.getTotalStudents();
        ArrayList<CourseSession> totalCourses = courseSessionController.getTotalCourses();

        CourseSession courseSession1 = new CourseSession("ENGL","101");
        courseSessionController.addCourse(courseSession1);
        CourseSession courseSession2 = new CourseSession("MATH","101");
        courseSessionController.addCourse(courseSession2);

        Student student1 = new Student(1,"Jane","Doe",0);
        courseSessionController.enrollStudent(student1);
        Student student2 = new Student(2,"John","Doe",0);
        courseSessionController.enrollStudent(student2);
        //added comment

        assertEquals(2,totalCourses.size());
        assertEquals(2,totalStudents.size());
        assertEquals(student1,totalStudents.get(0));
        assertEquals(student2,totalStudents.get(1));

        for (CourseSession totalCourse : totalCourses) {
            System.out.println(totalCourse);
        }
        for (Student totalStudent : totalStudents) {
            System.out.println(totalStudent);
        }


    }
}
