public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("Hotel Room Initialization");

        SingleRoom single = new SingleRoom();
        System.out.println("\nSingle Room:");
        single.displayRoomDetails();
        System.out.println("Available: 5");

        DoubleRoom dbl = new DoubleRoom();
        System.out.println("\nDouble Room:");
        dbl.displayRoomDetails();
        System.out.println("Available: 3");

        SuiteRoom suite = new SuiteRoom();
        System.out.println("\nSuite Room:");
        suite.displayRoomDetails();
        System.out.println("Available: 2");
    }
}