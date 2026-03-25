import java.util.*;

// Handles booking cancellation and rollback
public class CancellationService {

    // Stack to store released room IDs (LIFO for rollback view)
    private Stack<String> releasedRoomIds;

    // Map reservation ID → room type
    private Map<String, String> reservationRoomTypeMap;

    // Constructor
    public CancellationService() {
        releasedRoomIds = new Stack<>();
        reservationRoomTypeMap = new HashMap<>();
    }

    // Register confirmed booking
    public void registerBooking(String reservationId, String roomType) {
        reservationRoomTypeMap.put(reservationId, roomType);
    }

    // Cancel booking and restore inventory
    public void cancelBooking(String reservationId, RoomInventory inventory) {

        if (!reservationRoomTypeMap.containsKey(reservationId)) {
            System.out.println("Invalid reservation ID. Cancellation failed.");
            return;
        }

        String roomType = reservationRoomTypeMap.get(reservationId);

        // Restore inventory
        inventory.incrementRoom(roomType);

        // Track rollback (simulate released room ID)
        String releasedRoomId = roomType + "-1";
        releasedRoomIds.push(releasedRoomId);

        // Remove from map
        reservationRoomTypeMap.remove(reservationId);

        System.out.println("Booking cancelled successfully. Inventory restored for room type: " + roomType);
    }

    // Show rollback history
    public void showRollbackHistory() {
        System.out.println("Rollback History (Most Recent First):");

        for (int i = releasedRoomIds.size() - 1; i >= 0; i--) {
            System.out.println("Released Reservation ID: " + releasedRoomIds.get(i));
        }
    }
}