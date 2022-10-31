package Lab8.SRP.task1;

import java.util.ArrayList;

public class Entry {
    public String text;
    ArrayList<String>texts= new ArrayList<>();
    public void Save(String text){
        this.texts.add(text);
    }
    public String load(String text){
        return text;
    }
    public void addEntry(String letters){
        this.text=letters;
    }
    public void removeEntry(String text){
        this.texts.remove(text);
    }
}
