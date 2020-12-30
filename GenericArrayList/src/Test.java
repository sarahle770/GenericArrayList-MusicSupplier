import java.util.List;

/**
 * This file is a part of GenericArrayList project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class Test {
    public static void main(String[] args) {

        MusicSupplier musicSupplier = new MusicSupplier ();

        Track track = musicSupplier.getTrackByName ("Let it be");
        System.out.println ("Should be 'Let it be':");
        System.out.println (track);

        System.out.println ("Should be all beatles tracks");
        List<Track> allBandTracks = musicSupplier.getAllBandTracks ("The beatles");

        System.out.println (allBandTracks);

        List<Track> allTracksBelowPrice = musicSupplier.getAllTracksBellowPrice (100);
        System.out.println ("Track price bellow: " + allTracksBelowPrice);

        int length = musicSupplier.getTotalTracksLength ("Queen");
        System.out.println ("Should be 0: ");
        System.out.println (length);

    }
}
