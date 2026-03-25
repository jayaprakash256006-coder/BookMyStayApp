import java.util.*;

public class RoomInventory {

    private Map<String, Integer> rooms = new HashMap<>();

    public RoomInventory() {
        rooms.put("Single", 5);
        rooms.put("Double", 3);
        rooms.put("Suite", 2);
    }

    // Increase room count when cancelled
    public void incrementRoom(String roomType) {
        rooms.put(roomType, rooms.getOrDefault(roomType, 0) + 1);
    }

    // Get availability
    public int getAvailableRooms(String roomType) {
        return rooms.getOrDefault(roomType, 0);
    }
}