package mvc;

public class ParkingController {
    private ParkingSlot model;
    private ParkingView view;

    public ParkingController(ParkingSlot model, ParkingView view) {
        this.model = model;
        this.view = view;
    }

    public void setSlotAvailability(boolean isAvailable) {
        model.setAvailable(isAvailable);
    }

    public void updateView() {
        view.displayParkingSlot(model);
    }
}
