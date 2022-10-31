package lab7.task2;

public class ChooseTrip {
    public ITrip chooseTrip(VehicleType vehicleType,int distanceKM,int timeMinutes, int numberOfPassengers){
        ITrip dummy_trip;
        if(vehicleType.equals(VehicleType.SEDAN)) {
            dummy_trip = new SEDAN(distanceKM,timeMinutes,numberOfPassengers);
        } else if (vehicleType.equals(VehicleType.MOTOR_BIKE)) {
            dummy_trip = new MOTOR_BIKE(distanceKM,timeMinutes,numberOfPassengers);
        } else dummy_trip = new SEVEN_SEATER(distanceKM,timeMinutes,numberOfPassengers);
        return dummy_trip;
    }
}
