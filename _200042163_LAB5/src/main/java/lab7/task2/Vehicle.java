package lab7.task2;

public abstract class Vehicle {
    public int distanceKM;
    public int timeMinutes;
    public int numberOfPassengers;
    public Vehicle(int distanceKM,int timeMinutes,int numberOfPassengers) {
        this.distanceKM = distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }
}
