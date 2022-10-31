package lab5.task3;

public class Faculty extends Person{
        public String Designation;
        @Override
        public String ToString(){
           return this.name+" "+this.Address+" "+this.Age+" "+this.Designation;
        }
}
