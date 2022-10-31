package LAB6;

public class LengthStringGreaterthan4 extends Property<String>{

    public boolean CheckProperty(String word){
        if(word.length()>4)return  true;
        else return false;
    }
}
