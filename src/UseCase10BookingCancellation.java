public class UseCase10BookingCancellation {

    public static void main(String[] args) {

        System.out.println("Booking Cancellation");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Initialize cancellation service
        CancellationService cancellationService = new CancellationService();

        // Simulate confirmed booking
        String reservationId = "101";
        String roomType = "Single";

        cancellationService.registerBooking(reservationId, roomType);

        // Cancel booking
        cancellationService.cancelBooking(reservationId, inventory);

        // Show rollback history
        cancellationService.showRollbackHistory();

        // Show updated inventory
        System.out.println("Updated " + roomType + " Room Availability: "
                + inventory.getAvailableRooms(roomType));
    }
}