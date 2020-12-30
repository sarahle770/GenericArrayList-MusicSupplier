/**
 * This file is a part of GenericArrayList project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class Track {

    private final String name;
    private final String bandName;
    private final double price;
    private final int lengthInSeconds;

    public Track(String name, String bandName, double price, int lengthSeconds) {
        this.name = name;
        this.bandName = bandName;
        this.price = price;
        this.lengthInSeconds = lengthSeconds;
    }

    public String getName() {
        return name;
    }

    public String getBandName() {
        return bandName;
    }

    public double getPrice() {
        return price;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public String toString() {
        return "\n" + "Track Name: " + name + "\n" + "BandName: " + bandName + "\n " +
                "Price: " + price + "\n" +
                "LengthInSecond: " + lengthInSeconds + "\n";
    }
}
