package Lab9;

public class ExportToCSV implements IExport{
    @Override
    public String export(StudentEnrollment studentEnrollment){
        String csv_result="Name"+","+"ID"+","+"Program"+","+"CGPA"+"\n";
        for(Student student : studentEnrollment.student_list){
            csv_result=csv_result+student.Student_name+","
                    +student.Student_ID+","+student.Student_program+","+student.CGPA+"\n";
        }
        return csv_result;
    }
}
