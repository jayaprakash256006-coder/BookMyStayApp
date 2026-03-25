public class RoomAllocationService {

    public void allocateRoom(Reservation reservation, RoomInventory inventory) {

        String type = reservation.getRoomType();

        if (inventory.hasAvailableRoom(type)) {
            String roomId = inventory.allocateRoom(type);

            System.out.println(
                    "Booking confirmed for Guest: "
                            + reservation.getGuestName()
                            + ", Room ID: " + roomId
            );
        } else {
            System.out.println(
                    "No rooms available for Guest: "
                            + reservation.getGuestName()
            );
        }
    }
}