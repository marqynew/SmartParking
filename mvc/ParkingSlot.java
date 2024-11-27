package mvc;

public class ParkingSlot {
    private int id;
    private boolean isAvailable;

    public ParkingSlot(int id, boolean isAvailable) {
        this.id = id;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
