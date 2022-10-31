package Lab9;

enum Program{
            SWE,
            CSE,
            IT
    }
public class Student {
            public String Student_ID;
            public String Student_name;
            public Program Student_program;
            public float CGPA;
            public Student(String ID, String name, Program program, float cgpa) throws InvalidStudentIDException {
                    if(ID.length()!=9) {
                        throw new InvalidStudentIDException("Your id is invalid");
                    }
                    this.Student_ID=ID;
                    this.CGPA=cgpa;
                    this.Student_name=name;
                    this.Student_program=program;
            }
            public void Study(){
                    System.out.print(this.Student_name+" "+"studies");
            }
            public void Play(){
                     System.out.print(this.Student_name+" "+"plays");
            }
}
