package observer;

public class ParkingApp implements ParkingLotObserver {
    @Override
    public void update(String status) {
        System.out.println("Parking status updated: " + status);
    }
}
