package Lab9;

import java.util.Collections;
import java.util.Comparator;

public class ResultPublication{
    public void publish(String obj, StudentEnrollment studentEnrollment){
            if(obj=="Name"){
                Collections.sort(studentEnrollment.student_list, new SortByName());
            }
            else if(obj=="ID"){
                Collections.sort(studentEnrollment.student_list,new SortByID());
            }
            else {
                Collections.sort(studentEnrollment.student_list,new SortByCGPA());
            }
    }
    public void publish(String obj1,String obj2, StudentEnrollment studentEnrollment){
            if(obj1=="CGPA" && obj2=="ID")
                Collections.sort(studentEnrollment.student_list,new SortByCGPAandID());
    }
}
