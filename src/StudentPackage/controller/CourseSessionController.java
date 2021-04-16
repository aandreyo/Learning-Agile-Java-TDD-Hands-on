package StudentPackage.controller;

import StudentPackage.models.*;

import java.util.ArrayList;


public class CourseSessionController {

    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<CourseSession> courses = new ArrayList<CourseSession>();


    public void addCourse(CourseSession courseSession){
        courses.add(courseSession);
    }

    public int getNumOfCourses(){return courses.size();}
    public int getNumOfStudents() {
        return students.size();
    }


    public void enrollStudent(Student student){
        students.add(student);
    }

    public ArrayList<Student> getTotalStudents() {
        return students;
    }
    public ArrayList<CourseSession> getTotalCourses() {
        return courses;
    }
}
