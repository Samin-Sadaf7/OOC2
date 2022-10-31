package lab5.task3;

import java.util.ArrayList;
import java.util.List;

public class Printer<T extends Person> {
    public ArrayList<T> list = new ArrayList<T>();

    public void set(T obj) {

        this.list.add(obj);
    }
    public String PrintList() {
        String output = "";
        for (T obj : this.list) {
            output = output + obj.ToString() + '\n';
        }
        return output;
    }
}
