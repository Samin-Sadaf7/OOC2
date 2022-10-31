package LAB6;

import java.util.List;

public class Algorithm{

    public <T> int countlf(List<T> objlist, Property<T> property){
       int count=0;
        for (T obj: objlist) {
            if(property.CheckProperty(obj)){
                count++;
            }
        }
        return count;
    }

}
