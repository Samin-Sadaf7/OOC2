package Lab9;
import Lab9.*;
import org.junit.jupiter.api.Test;

import static Lab9.Program.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ResultPublicationTest {
    @Test
    public void sortbyIDtest() throws InvalidStudentIDException {
            StudentEnrollment studentEnrollment=new StudentEnrollment();
            Student student = new Student("200042163","Samin",SWE, 3.00f);
            studentEnrollment.student_list.add(student);
            Student student1= new Student("200042169","Amin",SWE, 3.10f);
            studentEnrollment.student_list.add(student1);
            Student student2=new Student("200042125","Maruf",SWE,4.00f);
            studentEnrollment.student_list.add(student2);
            ResultPublication resultPublication=new ResultPublication();
            resultPublication.publish("ID",studentEnrollment);
            String result=studentEnrollment.GetAll();
             assertEquals(" 200042125 Maruf SWE 4.0\n" +
                "200042163 Samin SWE 3.0\n" +
                "200042169 Amin SWE 3.1\n",result);
        }
    @Test
    public void sortbyNametest() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        Student student = new Student("200042163","Samin",SWE, 3.00f);
        studentEnrollment.student_list.add(student);
        Student student1= new Student("200042169","Amin",SWE, 3.10f);
        studentEnrollment.student_list.add(student1);
        Student student2=new Student("200042125","Maruf",SWE,4.00f);
        studentEnrollment.student_list.add(student2);
        ResultPublication resultPublication=new ResultPublication();
        resultPublication.publish("Name",studentEnrollment);
        String result=studentEnrollment.GetAll();
        assertEquals(" 200042169 Amin SWE 3.1\n" +
                "200042125 Maruf SWE 4.0\n" +
                "200042163 Samin SWE 3.0\n",result);
    }
    @Test
    public void sortbyCGPAtest() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        Student student = new Student("200042163","Samin",SWE, 3.00f);
        studentEnrollment.student_list.add(student);
        Student student1= new Student("200042169","Amin",SWE, 3.10f);
        studentEnrollment.student_list.add(student1);
        Student student2=new Student("200042125","Maruf",SWE,4.00f);
        studentEnrollment.student_list.add(student2);
        ResultPublication resultPublication=new ResultPublication();
        resultPublication.publish("CGPA",studentEnrollment);
        String result=studentEnrollment.GetAll();
        assertEquals(" 200042125 Maruf SWE 4.0\n" +
                "200042169 Amin SWE 3.1\n" +
                "200042163 Samin SWE 3.0\n",result);
    }
    @Test
    public void sortbyCGPAandIDtest() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        Student student = new Student("200042163","Samin",SWE, 3.00f);
        studentEnrollment.student_list.add(student);
        Student student1= new Student("200042169","Amin",SWE, 3.00f);
        studentEnrollment.student_list.add(student1);
        Student student2=new Student("200042125","Maruf",SWE,4.00f);
        studentEnrollment.student_list.add(student2);
        ResultPublication resultPublication=new ResultPublication();
        resultPublication.publish("CGPA","ID",studentEnrollment);
        String result=studentEnrollment.GetAll();
        assertEquals(" 200042125 Maruf SWE 4.0\n" +
                "200042163 Samin SWE 3.0\n" +
                "200042169 Amin SWE 3.0\n",result);
    }
}
