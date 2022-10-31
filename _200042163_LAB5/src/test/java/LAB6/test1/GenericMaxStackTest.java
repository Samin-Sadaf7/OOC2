package LAB6.test1;
import LAB6.GerericMaxStack;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericMaxStackTest {
        @Test
        public void Test_Generic_int_max(){
            GerericMaxStack<Integer>IntStack = new GerericMaxStack<Integer>();
            IntStack.Push(3);
            IntStack.Push(5);
            IntStack.Push(2);
            assertEquals(5,IntStack.max_element());
        }
        @Test
        public void Test_Pop_Generic_int_max(){
            GerericMaxStack<Integer>IntStack = new GerericMaxStack<Integer>();
            IntStack.Push(2);
            IntStack.Push(1);
            IntStack.Push(2);
            IntStack.Push(5);
            IntStack.Pop();
            assertEquals(2,IntStack.max_element());
            IntStack.Pop();
            assertEquals(2,IntStack.max_element());
        }
        @Test
        public void Test_Generic_Double(){
            GerericMaxStack<Double>DoubleStack = new GerericMaxStack<Double>();
            DoubleStack.Push(49.75);
            DoubleStack.Push(23.45);
            DoubleStack.Push(100.0);
            DoubleStack.Pop();
            assertEquals(49.75, DoubleStack.max_element());
        }
        @Test
        public void Test_Generic_String(){
            GerericMaxStack<String>StringStack = new GerericMaxStack<String>();
            StringStack.Push("OOC is bad");
            StringStack.Push("Nothing to understand");
            StringStack.Push("Try Hard");
            StringStack.Pop();
            assertEquals("OOC is bad", StringStack.max_element());
        }
}
