package Lab9;

import java.util.Comparator;

public class SortByCGPA implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return Float.compare(s2.CGPA, s1.CGPA);
    }
}
