package Lab8.test2;
import  Lab8.task1.*;
import Lab8.task2.Car;
import Lab8.task2.Drone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SwitchTestDrone {
    @Test
    public void CameraTest(){
        Drone drone= new Drone();
        assertTrue(drone.CameraOn());
        assertFalse(drone.CameraOff());
    }
    @Test
    public void EngineTest(){
        Drone drone= new Drone();
        assertFalse(drone.EngineOff());
        assertTrue(drone.StartEngine());
    }
}
