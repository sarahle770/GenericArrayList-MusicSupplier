import java.util.ArrayList;
import java.util.List;

/**
 * This file is a part of GenericArrayList project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class MusicSupplier {
    private final ArrayList<Track> tracks;

    public MusicSupplier() {
        this.tracks = new ArrayList<> ();
        tracks.add (new Track ("Let it be", "The beatles", 45, 180));
        tracks.add (new Track ("Pshutim,", "Akiva", 35, 65));
    }

    public MusicSupplier(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }


    public Track getTrackByName(String name) {
        for (Track track : tracks) {
            if (track.getName ().equals (name)) {
                return track;
            }
        }
        return null;
    }

    public List<Track> getAllTracksBellowPrice(double price) {
        List<Track> tracksBellowPrice = new ArrayList<> ();
        for (Track track : tracks) {
            if (track.getPrice () < price) {
                tracksBellowPrice.add (track);
            }
        }
        return tracksBellowPrice;
    }

    public List<Track> getAllBandTracks(String bandName) {
        List<Track> bandTracks = new ArrayList<> ();
        for (Track track : tracks) {
            if (track != null) {
                if (track.getBandName ().equals (bandName)) {
                    bandTracks.add (track);
                }
            }
        }
        return bandTracks;
    }
    public int getTotalTracksLength(String bandName) {
        int lengthOfTrack = 0;
        List<Track> allBandTracks = getAllBandTracks (bandName);
        for (Track track : allBandTracks) {
            if (track.getBandName ().equals (bandName)) {
                lengthOfTrack += track.getLengthInSeconds ();
            }
        }
        return lengthOfTrack;
    }
}




