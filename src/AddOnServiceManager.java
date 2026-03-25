import java.util.*;

public class AddOnServiceManager {

    // Maps reservation ID to list of services
    private Map<String, List<AddOnService>> servicesByReservation;

    // Constructor
    public AddOnServiceManager() {
        servicesByReservation = new HashMap<>();
    }

    // Add service to a reservation
    public void addService(String reservationId, AddOnService service) {
        servicesByReservation
                .computeIfAbsent(reservationId, k -> new ArrayList<>())
                .add(service);
    }

    // Calculate total service cost
    public double calculateTotalServiceCost(String reservationId) {
        double total = 0.0;

        List<AddOnService> services = servicesByReservation.get(reservationId);
        if (services != null) {
            for (AddOnService s : services) {
                total += s.getCost();
            }
        }

        return total;
    }
}