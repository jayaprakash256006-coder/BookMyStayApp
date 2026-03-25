public class UseCase12DataPersistenceRecovery {

    public static void main(String[] args) {

        System.out.println("System Recovery");

        // File path
        String filePath = "inventory.txt";

        // Initialize components
        RoomInventory inventory = new RoomInventory();
        FilePersistenceService persistenceService = new FilePersistenceService();

        // Load previous state
        persistenceService.loadInventory(inventory, filePath);

        // Display inventory
        System.out.println("Current Inventory:");
        System.out.println("Single: " + inventory.getAvailableRooms("Single"));
        System.out.println("Double: " + inventory.getAvailableRooms("Double"));
        System.out.println("Suite: " + inventory.getAvailableRooms("Suite"));

        // Save state
        persistenceService.saveInventory(inventory, filePath);
    }
}