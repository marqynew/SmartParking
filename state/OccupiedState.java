package state;

public class OccupiedState implements ParkingState {
    @Override
    public void handle() {
        System.out.println("The parking slot is occupied.");
    }
}
