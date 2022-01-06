/*
 * This is the Bike class.
 *
 * @author  Jenoe Balote
 * @version 1.0
 * @since   2022-01-02
 */

/**
 * Bike class, extends Vehicle.
 * */
public class Bike extends Vehicle {
    /**
     * Bike's speed.
     * */
    private int speed;
    /**
     * RPM of the bike.
     * */
    private int cadence;

    /**
     * Instantiates a bike.
     *
     * @param newColour the colour of the truck
     * @param newMaxSpeed the max speed
     * */
    public Bike(final String newColour, final int newMaxSpeed) {
        super(newColour, newMaxSpeed);
        this.speed = 0;
        this.cadence = 0;
    }

    /**
     * Gets cadence.
     *
     * @return cadence.
     * */
    public int getCadence() {
        return cadence;
    }

    /**
     * Sets cadence.
     *
     * @param newCadence the new cadence.
     * */
    public void setCadence(final int newCadence) {
        this.cadence = newCadence;
    }

    /**
     * Increases the bike speed.
     *
     * @param accelerateBy increase the speed by this amount.
     * */
    public void accelerate(final int accelerateBy) {
        super.speed += accelerateBy;
    }

    /**
     * Rings bell.
     * */
    public static void ringBell() {
        System.out.println("Ding!");
    }
}
