package lab5.test1;
import lab5.task1.FizzBuzz;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FizzBuzzTest {
    FizzBuzz fz = new FizzBuzz();
    @Test
    public void Test_getFizzBuzz() {
        int check_number = 21;
        assertEquals("Fizzbuzz", fz.getFizzBuzz(check_number));
    }
    @Test
       public void Test_getBuzz() {
        int check_number = 7;
        assertEquals("Buzz", fz.getFizzBuzz(check_number));
    }
    @Test
        public void Test_getFizz() {
        int check_number = 3;
        assertEquals("Fizz", fz.getFizzBuzz(check_number));
    }
    @Test
        public void Test_getGotcha(){
        int check_number =5;
        assertEquals("Gotcha",fz.getFizzBuzz(check_number));
    }

}