import observer.*;
import mvc.*;
import decorator.*;
import state.*;
import strategy.*;

public class SmartParkingSystem {
    public static void main(String[] args) {
        // Observer Pattern
        ParkingSensor sensor = new ParkingSensor();
        ParkingApp app = new ParkingApp();
        sensor.addObserver(app);
        sensor.setStatus("Slot 1: Occupied");

        // MVC Pattern
        ParkingSlot slot = new ParkingSlot(1, true);
        ParkingView view = new ParkingView();
        ParkingController controller = new ParkingController(slot, view);
        controller.updateView();
        controller.setSlotAvailability(false);
        controller.updateView();

        // Decorator Pattern
        Data userData = new UserData("User123");
        Data encryptedData = new EncryptedDataDecorator(userData);
        System.out.println("Encrypted Data: " + encryptedData.getData());

        // State Pattern
        ParkingSlotStateContext context = new ParkingSlotStateContext();
        context.setState(new AvailableState());
        context.applyState();
        context.setState(new OccupiedState());
        context.applyState();

        // Strategy Pattern
        PaymentContext payment = new PaymentContext();
        payment.setStrategy(new CreditCardPayment());
        payment.pay(50);
        payment.setStrategy(new EWalletPayment());
        payment.pay(30);
    }
}
