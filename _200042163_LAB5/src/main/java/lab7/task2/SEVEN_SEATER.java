package lab7.task2;

public class SEVEN_SEATER extends Vehicle implements ITrip{

    public SEVEN_SEATER(int distanceKM,int timeMinutes,int numberOfPassengers) {
        super(distanceKM,timeMinutes,numberOfPassengers);
    }

    @Override
    public int perHeadFare() {
        int fare=-1;
        if(carTakeTrip()) {
            fare = distanceKM * 30 / numberOfPassengers;
            return fare - (fare % 5);
        }
        return fare;
    }

    @Override
    public boolean carTakeTrip() {
        if (numberOfPassengers < 1)
            return false;
        else{
            return numberOfPassengers <= 7 && distanceKM >= 10;
        }
    }
}
