package LAB6.test3;
import LAB6.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgorithmTest {
        @Test
        public void test1(){
            ArrayList<Integer> intlist=new ArrayList<Integer>();
            intlist.add(2);
            intlist.add(3);
            intlist.add(5);
            intlist.add(6);
            Algorithm algo= new Algorithm();
            Divby3 div= new Divby3();
            algo.countlf(intlist, div);
            assertEquals(2, algo.countlf(intlist, div));
        }
        @Test
        public void test2(){
            ArrayList<String> stringlist=new ArrayList<String>();
            stringlist.add("Alice");
            stringlist.add("Bob");
            stringlist.add("Beautiful");
            Algorithm algo= new Algorithm();
            LengthStringGreaterthan4 str= new LengthStringGreaterthan4();
            assertEquals(2, algo.countlf(stringlist, str));
        }
    }
