import java.util.*;

public class RoomInventory {

    private Map<String, Integer> rooms = new HashMap<>();

    public RoomInventory() {
        rooms.put("Single", 5);
        rooms.put("Double", 3);
        rooms.put("Suite", 2);
    }

    public boolean hasAvailableRoom(String type) {
        return rooms.getOrDefault(type, 0) > 0;
    }

    public String allocateRoom(String type) {
        int count = rooms.get(type);
        rooms.put(type, count - 1);
        return type + "-" + count;
    }

    public int getAvailableRooms(String type) {
        return rooms.getOrDefault(type, 0);
    }
}