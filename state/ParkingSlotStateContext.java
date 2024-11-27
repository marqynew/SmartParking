package state;

public class ParkingSlotStateContext {
    private ParkingState state;

    public void setState(ParkingState state) {
        this.state = state;
    }

    public void applyState() {
        state.handle();
    }
}
