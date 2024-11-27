package mvc;

public class ParkingView {
    public void displayParkingSlot(ParkingSlot slot) {
        System.out.println("Slot ID: " + slot.getId() + " | Available: " + slot.isAvailable());
    }
}
