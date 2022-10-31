package Lab9;
import Lab9.*;
import org.junit.jupiter.api.Test;

import static Lab9.ExporterType.*;
import static Lab9.Program.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ExportTest {
    @Test
    public void CSVtest() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment= new StudentEnrollment();
        Student student= new Student("200042163","Samin",SWE, 3.22f);
        studentEnrollment.student_list.add(student);
        Student student1= new Student("200042165","Jawadul",SWE, 3.92f);
        studentEnrollment.student_list.add(student1);
        Student student2= new Student("200042160","Mushfiq",SWE, 3.80f);
        studentEnrollment.student_list.add(student2);
        Exporter exporter= new Exporter();
        String result= exporter.export(CSV,studentEnrollment);
        assertEquals("Name,ID,Program,CGPA\n" +
                "Samin,200042163,SWE,3.22\n" +
                "Jawadul,200042165,SWE,3.92\n" +
                "Mushfiq,200042160,SWE,3.8\n",result);
    }
    @Test
    public void XMLtest() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment= new StudentEnrollment();
        Student student= new Student("200042163","Samin",SWE, 3.22f);
        studentEnrollment.student_list.add(student);
        Student student1= new Student("200042165","Jawadul",SWE, 3.92f);
        studentEnrollment.student_list.add(student1);
        Student student2= new Student("200042160","Mushfiq",SWE, 3.80f);
        studentEnrollment.student_list.add(student2);
        Exporter exporter= new Exporter();
        String result= exporter.export(XML,studentEnrollment);
        assertEquals(" <Student>\n" +
                "<ID>200042163</ID>\n" +
                "<Name>Samin</Name>\n" +
                "<Program>SWE</Program>\n" +
                "<CGPA>3.22</CGPA>\n" +
                "</Student>\n" +
                "<Student>\n" +
                "<ID>200042165</ID>\n" +
                "<Name>Jawadul</Name>\n" +
                "<Program>SWE</Program>\n" +
                "<CGPA>3.92</CGPA>\n" +
                "</Student>\n" +
                "<Student>\n" +
                "<ID>200042160</ID>\n" +
                "<Name>Mushfiq</Name>\n" +
                "<Program>SWE</Program>\n" +
                "<CGPA>3.8</CGPA>\n" +
                "</Student>\n",result);
    }
}
