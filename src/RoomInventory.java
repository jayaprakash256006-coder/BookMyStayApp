import java.util.*;

public class RoomInventory {

    private Map<String, Integer> rooms = new HashMap<>();

    public RoomInventory() {
        rooms.put("Single", 2);
        rooms.put("Double", 2);
        rooms.put("Suite", 1);
    }

    public boolean hasAvailableRoom(String roomType) {
        return rooms.containsKey(roomType) && rooms.get(roomType) > 0;
    }
}