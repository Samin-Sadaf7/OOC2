package lab7.task2_test;
import lab7.task2.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TripTest {
    @Test
    public void motorbikeTripTest(){
        Trip trip = new Trip(VehicleType.MOTOR_BIKE, 100,22,11);
        assertFalse(trip.carTakeTrip());
        Trip another_trip= new Trip(VehicleType.MOTOR_BIKE,9,11,1);
        assertTrue(another_trip.carTakeTrip());
        }
    @Test
    public void SedanTripTest(){
        Trip trip = new Trip(VehicleType.SEDAN, 29,4,12);
        assertFalse(trip.carTakeTrip());
        Trip another_trip= new Trip(VehicleType.SEDAN,4,4,1);
        assertTrue(another_trip.carTakeTrip());
    }
    @Test
    public void SevenSeaterTripTest(){
        Trip trip = new Trip(VehicleType.SEVEN_SEATER, 29,4,12);
        assertFalse(trip.carTakeTrip());
        Trip another_trip= new Trip(VehicleType.SEVEN_SEATER,11,4,1);
        assertTrue(another_trip.carTakeTrip());
    }
    @Test
    public void motorbikeFareTest(){
        Trip trip = new Trip(VehicleType.MOTOR_BIKE, 100,22,11);
        assertEquals(-1,trip.perHeadFare());
        Trip another_trip= new Trip(VehicleType.MOTOR_BIKE,9,11,1);
        assertEquals(180,another_trip.perHeadFare());
    }
    @Test
    public void SedanFareTest(){
        Trip trip = new Trip(VehicleType.SEDAN, 29,4,12);
        assertEquals(-1,trip.perHeadFare());
        Trip another_trip= new Trip(VehicleType.SEDAN,4,4,1);
        assertEquals(175,another_trip.perHeadFare());
    }
    @Test
    public void SevenSeaterFareTest(){
        Trip trip = new Trip(VehicleType.SEVEN_SEATER, 29,4,12);
        assertEquals(-1,trip.perHeadFare());
        Trip another_trip= new Trip(VehicleType.SEVEN_SEATER,11,4,1);
        assertEquals(330,another_trip.perHeadFare());
    }
    }

