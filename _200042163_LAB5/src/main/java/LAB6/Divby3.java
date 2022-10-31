package LAB6;
import java.util.List;
public class Divby3 extends Property<Integer>{
        public boolean CheckProperty(Integer number){
            if(number%3==0)return true;
            else return  false;
        }
}
