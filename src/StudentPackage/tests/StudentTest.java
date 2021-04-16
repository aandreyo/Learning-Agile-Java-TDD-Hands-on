package StudentPackage.tests;

import StudentPackage.models.Student;


public class StudentTest extends junit.framework.TestCase {

   //test create method
    public void testCreate(){

        Student firstStudent = new Student(143216545,"John","Doe",95.0);

        assertEquals("John",firstStudent.getFirstName());
        assertEquals("Doe",firstStudent.getLastName());
        System.out.println(firstStudent.getFirstName()+" "+firstStudent.getLastName());


        Student secondStudent = new Student(154495524,"Drew","BarryMoore",100);

        assertEquals("Drew", secondStudent.getFirstName());
        assertEquals("BarryMoore",secondStudent.getLastName());
        System.out.println(secondStudent.getFirstName()+" "+secondStudent.getLastName());
    }

}
