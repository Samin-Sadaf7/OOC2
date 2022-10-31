package lab7.task2;

public class MOTOR_BIKE extends Vehicle implements ITrip{

    public MOTOR_BIKE(int distanceKM,int timeMinutes,int numberOfPassengers) {
        super(distanceKM,timeMinutes,numberOfPassengers);
    }
    @Override
    public int perHeadFare() {
        int fare=-1;
        if(carTakeTrip()) {
            fare = Math.max(25, this.distanceKM * 20) /this.numberOfPassengers;
            return fare - (fare % 5);
        }
        return fare;
    }

    @Override
    public boolean carTakeTrip() {
        if (this.numberOfPassengers < 1)
            return false;
        return this.numberOfPassengers == 1 && this.distanceKM <= 10;
    }
}
