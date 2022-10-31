package Lab9;

public class ExportToXML implements IExport{
    public String export(StudentEnrollment studentEnrollment){
        String xmlout=" ";
        for(Student student:studentEnrollment.student_list){
            xmlout=xmlout+"<Student>"+"\n";
            xmlout=xmlout+"<ID>"+student.Student_ID+"</ID>"+"\n";
            xmlout=xmlout+"<Name>"+student.Student_name+"</Name>"+"\n";
            xmlout=xmlout+"<Program>"+student.Student_program+"</Program>"+"\n";
            xmlout=xmlout+"<CGPA>"+student.CGPA+"</CGPA>"+"\n";
            xmlout=xmlout+"</Student>"+"\n";
        }
        return xmlout;
    }
}
