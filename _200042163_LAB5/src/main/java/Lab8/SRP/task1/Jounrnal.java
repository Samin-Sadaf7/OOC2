package Lab8.SRP.task1;

import java.util.ArrayList;

public class Jounrnal {
    ArrayList<Entry> entries= new ArrayList<>();
    public void save(Entry entry){
        entries.add(entry);
    }

}
