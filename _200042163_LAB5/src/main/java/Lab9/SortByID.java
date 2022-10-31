package Lab9;

import java.util.Comparator;

public class SortByID implements Comparator<Student> {
    public int compare(Student s1, Student s2){
        return s1.Student_ID.compareTo(s2.Student_ID);
    }
}
