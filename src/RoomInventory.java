import java.util.*;

public class RoomInventory {

    private Map<String, Integer> rooms = new HashMap<>();

    public RoomInventory() {
        rooms.put("Single", 5);
        rooms.put("Double", 3);
        rooms.put("Suite", 2);
    }

    public Map<String, Integer> getAllRooms() {
        return rooms;
    }

    public void setRooms(Map<String, Integer> newRooms) {
        rooms = newRooms;
    }

    public int getAvailableRooms(String type) {
        return rooms.getOrDefault(type, 0);
    }
}