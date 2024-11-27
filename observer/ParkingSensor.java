package observer;

import java.util.ArrayList;
import java.util.List;

public class ParkingSensor {
    private List<ParkingLotObserver> observers = new ArrayList<>();
    private String status;

    public void addObserver(ParkingLotObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ParkingLotObserver observer) {
        observers.remove(observer);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (ParkingLotObserver observer : observers) {
            observer.update(status);
        }
    }
}
