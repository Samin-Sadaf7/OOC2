package lab7.task2;

public class SEDAN  extends Vehicle implements ITrip{

    public SEDAN(int distanceKM,int timeMinutes,int numberOfPassengers) {
        super(distanceKM,timeMinutes,numberOfPassengers);
    }
    @Override
    public int perHeadFare() {
        int fare = -1;
        if(carTakeTrip()){
            fare = (50 + this.distanceKM * 30 + this.timeMinutes * 2) / this.numberOfPassengers;
            return  fare-(fare%5);
        }
        return fare;
    }

    @Override
    public boolean carTakeTrip() {
        if (this.numberOfPassengers < 1)
            return false;
        else{
            return this.numberOfPassengers <= 4 &&  this.distanceKM <= 25;
        }
    }
}
