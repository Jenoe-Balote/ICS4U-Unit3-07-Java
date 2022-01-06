/*
 * This class demonstrates the vehicle subclasses
 *
 * @author  Jenoe Balote
 * @version 1.0
 * @since   2022-01-02
 */

/**
 * This is a stub program for the Vehicle subclasses.
 * */
final class Main {

    /**
     * Prevents instantiation.
     * Throw an exception IllegalStateException when called.
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Creates 2 vehicle subclasses and uses its getters, setters and methods.
     *
     * @param args No args will be used.
     */
    public static void main(final String[] args) {

        final Truck truck = new Truck("Pink", 350, "GHI789");
        final Bike bike = new Bike("Purple", 50);

        final int placeholder = 200;
        final int placeholder2 = 100;
        final int accelerate = 40;

        // Formatting truck subclass to print
        truck.accelerate(placeholder);
        truck.provideAir(2);

        System.out.print("Vehicle: Truck");
        System.out.printf("\nLicense Plate: %s\nMax Speed: %s",
            truck.getLicensePlate(), truck.getMaxSpeed());
        System.out.printf("\nCurrent Speed: %s\nColour: %s\n\n",
            truck.getSpeed(), truck.getColour());

        // Formatting bike subclass to print
        bike.setCadence(placeholder2);
        bike.accelerate(accelerate);

        System.out.print("Vehicle: Bike");
        System.out.printf("\nColour: %s\nMax Speed: %s",
            bike.getColour(), bike.getMaxSpeed());
        System.out.printf("\nCurrent Speed: %s\nCadence: %s\n",
            bike.getSpeed(), bike.getCadence());
        bike.ringBell();

        System.out.println("\nDone.");
    }
}

