public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        System.out.println("Add-On Service Selection");

        // Sample reservation
        String reservationId = "10";
        String room = "Single-1";

        // Create manager
        AddOnServiceManager manager = new AddOnServiceManager();

        // Add services
        AddOnService breakfast = new AddOnService("Breakfast", 500);
        AddOnService spa = new AddOnService("Spa", 1000);

        manager.addService(reservationId, breakfast);
        manager.addService(reservationId, spa);

        // Calculate total
        double totalCost = manager.calculateTotalServiceCost(reservationId);

        // Output
        System.out.println("Reservation ID: " + reservationId + ": " + room);
        System.out.println("Total Add-On Cost: " + totalCost);
    }
}