import java.util.*;

// Maintains confirmed reservations
public class BookingHistory {

    // List to store confirmed reservations
    private List<Reservation> confirmedReservations;

    // Constructor
    public BookingHistory() {
        confirmedReservations = new ArrayList<>();
    }

    // Add a confirmed reservation
    public void addReservation(Reservation reservation) {
        confirmedReservations.add(reservation);
    }

    // Get all confirmed reservations
    public List<Reservation> getConfirmedReservations() {
        return confirmedReservations;
    }
}