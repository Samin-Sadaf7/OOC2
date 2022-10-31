package Lab9;

import java.util.Comparator;

public class SortByCGPAandID implements Comparator<Student>{

    SortByID sortByID=new SortByID();
    SortByCGPA sortByCGPA=new SortByCGPA();

    public int compare(Student s1, Student s2){

        int CGPA_compare=sortByCGPA.compare(s1,s2);
        int ID_compare=sortByID.compare(s1,s2);
        return (CGPA_compare==0)?CGPA_compare:ID_compare;

    }
}
