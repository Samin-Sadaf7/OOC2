package Lab8.test2;
import  Lab8.task1.*;
import Lab8.task2.Car;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SwitchTestCar {
    @Test
    public void RadioSwitch(){
        Car car= new Car();
        assertTrue(car.RadioOn());
        assertFalse(car.RadioOff());
    }
    @Test
    public void EngineSwitch(){
        Car car= new Car();
        assertTrue(car.StartEngine());
        assertFalse(car.EngineOff());
    }
}
