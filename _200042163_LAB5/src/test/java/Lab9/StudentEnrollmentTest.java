package Lab9;
import Lab9.*;
import org.junit.jupiter.api.Test;

import static Lab9.Program.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class StudentEnrollmentTest {
    @Test
    public void StudentAddTest() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment =new StudentEnrollment();
        Student student= new Student("200042163","Samin",SWE, 3.22f);
        studentEnrollment.student_list.add(student);
        Student latest_student= studentEnrollment.student_list.get(studentEnrollment.student_list.size()-1);
        String latest_add=latest_student.Student_ID+latest_student.Student_name+latest_student.Student_program+latest_student.CGPA;
        assertEquals("200042163"+"Samin"+"SWE"+"3.22", latest_add);
    }
    @Test
    public  void StudentRemoveTest() throws InvalidStudentIDException{
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        Student student= new Student("200042163","Samin",SWE, 3.22f);
        studentEnrollment.student_list.add(student);
        Student student1= new Student("200042165","Jawadul",SWE, 3.92f);
        studentEnrollment.student_list.add(student1);
        Student student2= new Student("200042160","Mushfiq",SWE, 3.80f);
        studentEnrollment.student_list.add(student2);
        studentEnrollment.remove(student2);
        assertEquals(2,studentEnrollment.student_list.size());
        studentEnrollment.remove("200042163");
        assertEquals(1,studentEnrollment.student_list.size());
    }
    @Test
    public  void StudentgetAllTest() throws InvalidStudentIDException{
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        Student student= new Student("200042163","Samin",SWE, 3.22f);
        studentEnrollment.student_list.add(student);
        Student student1= new Student("200042165","Jawadul",SWE, 3.92f);
        studentEnrollment.student_list.add(student1);
        Student student2= new Student("200042160","Mushfiq",SWE, 3.80f);
        studentEnrollment.student_list.add(student2);
        String getAllresult= studentEnrollment.GetAll();
        assertEquals(" 200042163 Samin SWE 3.22\n" +
                "200042165 Jawadul SWE 3.92\n" +
                "200042160 Mushfiq SWE 3.8\n",getAllresult);
    }
    @Test
    public void StudentGettest()throws InvalidStudentIDException{

        StudentEnrollment studentEnrollment=new StudentEnrollment();
        Student student= new Student("200042163","Samin",SWE, 3.22f);
        studentEnrollment.student_list.add(student);
        Student student1= new Student("200042165","Jawadul",SWE, 3.92f);
        studentEnrollment.student_list.add(student1);
        Student student2= new Student("200042160","Mushfiq",SWE, 3.80f);
        studentEnrollment.student_list.add(student2);
        Student dummy=studentEnrollment.get(student2);
        String ID=dummy.Student_ID;
        assertEquals("200042160",ID);
        Student dummy2=studentEnrollment.get("200042163");
        assertEquals("200042163",dummy2.Student_ID);
    }
}
