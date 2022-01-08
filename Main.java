/*
 * This class demonstrates the vehicle subclasses
 *
 * @author  Jenoe Balote
 * @version 1.0
 * @since   2022-01-06
 */

/**
 * Stub program for the Vehicle subclasses.
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

        final Truck truck = new Truck("Green", 350, "GHI789", 4);
        final Bike bike = new Bike("Purple", 50, 2);

        // Made to pass linting so there is no magic numbers
        final int placeholder = 40;
        final int placeholder2 = 100;

        truck.setColour("Pink");
        truck.accelerate(placeholder2);

        System.out.print("Vehicle: Truck");
        System.out.printf("\nLicense Plate: %s\nMax Speed: %s",
            truck.getLicensePlate(), truck.getMaxSpeed());
        System.out.printf("\nSpeed: %s\nColour: %s"
                          + "\nNumber of Tires: %s\n\n",
            truck.getSpeed(), truck.getColour(), truck.getNumOfTires());

        bike.accelerate(placeholder);
        bike.setCadence(placeholder);
        bike.setCadence(placeholder2);

        System.out.print("Vehicle: Bike");
        System.out.printf("\nColour: %s\nMax Speed: %s",
            bike.getColour(), bike.getMaxSpeed());
        System.out.printf("\nCurrent Speed: %s\nCadence: %s"
                          + "\nNumber of Tires: %s\n",
            bike.getSpeed(), bike.getCadence(), bike.getNumOfTires());

        System.out.println("\nDone.");
    }
}

