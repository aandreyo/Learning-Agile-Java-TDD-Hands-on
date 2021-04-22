package StudentPackage.controller;

import StudentPackage.models.*;

import java.util.*;


public class CourseSessionController {

    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<CourseSession> courses = new ArrayList<CourseSession>();
   
    public void addCourse(CourseSession courseSession){
        courses.add(courseSession);
    }

    public int getNumOfCourses(){
    	return courses.size();
    }
    
    public int getNumOfStudents() {
        return students.size();
    }

    public void enrollStudent(Student student){
        students.add(student);
    }

    public Student getStudents(int index){
    	return students.get(index);
    }
    
    public CourseSession getCourses(int index) {
    	return courses.get(index);
    }
}
