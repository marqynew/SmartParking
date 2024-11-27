package state;

public class AvailableState implements ParkingState {
    @Override
    public void handle() {
        System.out.println("The parking slot is available.");
    }
}
