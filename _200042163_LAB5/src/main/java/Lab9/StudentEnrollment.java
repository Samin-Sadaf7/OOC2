package Lab9;

import java.util.ArrayList;

public class StudentEnrollment {
    ArrayList<Student>student_list= new ArrayList<Student>();
    public String GetAll(){
        String whole_list=" ";
        for(Student x:student_list){
            whole_list=whole_list+ x.Student_ID+" "+x.Student_name+" "+x.Student_program+" "+x.CGPA+"\n";
        }
        return  whole_list;
    }
    public void add(Student student){

        student_list.add(student);

    }
    public void remove(Student student){
        student_list.remove(student);
    }
    public void remove(String Student_ID){
        for(Student x: student_list){
            if(x.Student_ID==Student_ID){
                student_list.remove(x);
                break;
            }
        }
    }
    public Student get(Student student){
        for(Student x:student_list){
            if(x==student){
                return x;
            }
        }
        return null;
    }
    public Student get(String ID){
        for(Student x: student_list){
            if(x.Student_ID.equals(ID)){
                return x;
            }
        }
        return null;
    }
    public void PrintList(){
        System.out.print("Student ID"+" "+"Student name"+" "+"Student Program"+" "+"Student CGPA");
        String list= this.GetAll();
        System.out.print(list);
    }
}
