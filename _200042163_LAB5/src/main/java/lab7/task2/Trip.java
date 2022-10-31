package lab7.task2;

import java.sql.Time;

public class Trip {
    private ITrip dummy_trip;
    public Trip(VehicleType type, int distanceKM, int TimeMinutes, int numberPassengers){
        ChooseTrip c_Trip= new ChooseTrip();
        this.dummy_trip=c_Trip.chooseTrip(type,distanceKM, TimeMinutes,numberPassengers);
    }
    public int perHeadFare(){
        return dummy_trip.perHeadFare();
    }
    public boolean carTakeTrip(){
        return dummy_trip.carTakeTrip();
    }
}
