package lab5.task3;

public class Student extends Person {
        public int StudentID;
        @Override
        public String ToString(){
            return this.name+" "+this.Address+" "+this.Age+" "+this.StudentID;
        }
}
