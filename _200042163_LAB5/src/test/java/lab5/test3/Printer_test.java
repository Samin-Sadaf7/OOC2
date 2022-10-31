package lab5.test3;
import lab5.task3.Person;
import  lab5.task3.Printer;
import lab5.task3.Faculty;
import lab5.task3.Student;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Printer_test {
        @Test
        public void Test_PrintList(){
            Student student = new Student();
            student.name="A";
            student.Age=20;
            student.Address="B";
            student.StudentID=120;
            Printer printer= new Printer();
            printer.set(student);
            String original_output= printer.PrintList();
            String expected_output="A"+" "+"B"+" "+20+" "+120+'\n';
            assertEquals(expected_output,original_output);
        }
        @Test
        public void Test_multipleLine(){
            Student student = new Student();
            student.name="A";
            student.Age=20;
            student.Address="B";
            student.StudentID=120;
            Printer printer= new Printer();
            printer.set(student);
            String expected_output="A"+" "+"B"+" "+20+" "+120+'\n';
            Faculty faculty = new Faculty();
            faculty.name="J";
            faculty.Age=40;
            faculty.Address="I";
            faculty.Designation="Assistant Professor";
            printer.set(faculty);
            expected_output= expected_output+"J"+" "+"I"+" "+40+" "+"Assistant Professor"+"\n";
            assertEquals(expected_output,printer.PrintList());
        }
}
