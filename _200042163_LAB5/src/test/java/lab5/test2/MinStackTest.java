package lab5.test2;
import  lab5.task2.MinStack;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MinStackTest {

    @Test
    public void checkMin(){
        MinStack ms = new MinStack();
        ms.Push(3);
        ms.Push(2);
        ms.Push(5);
        ms.Push(1);
        assertEquals(1, ms.get_Min());
    }
    @Test
    public void checkPopMin() {
        MinStack ms = new MinStack();
        ms.Push(3);
        ms.Push(2);
        ms.Push(5);
        ms.Push(1);
        ms.Pop();
        assertEquals(2, ms.get_Min());
    }
    @Test
    public void CreateAnotherCheck(){
        MinStack ms = new MinStack();
        ms.Push(12);
        ms.Push(3);
        ms.Push(4);
        assertEquals(3,ms.get_Min());
    }
}
