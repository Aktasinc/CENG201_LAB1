/**
 * Track.java
 * shows a single music track in a streaming playlist
 *
 * Sami Yusuf Aktaş
 * 250444045
 * 5.10.2026
 */
public class Track {


    private String title;
    private String artist;
    private int    durationSeconds;
    private boolean isExplicit;


    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        this.title = title;
        this.artist = artist;

        if (durationSeconds >= 0) {
            this.durationSeconds = durationSeconds;
        } else {
            System.out.println("warning: invalid duration. setting to 0");
            this.durationSeconds = 0;
        }

        this.isExplicit = isExplicit;
    }


    public Track(String title, String artist) {
        this(title, artist, 0, false);
    }


    public Track(String title) {
        this(title, "unknown artist", 0, false);
    }


    public Track() {
        this("unknown title", "unknown artist", 0, false);
    }


    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public boolean isExplicit() {
        return isExplicit;
    }


    public String getDurationFormatted() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }


    @Override
    public String toString() {
        String result = "\"" + title + "\" by " + artist + " [" + getDurationFormatted() + "]";
        if (isExplicit) {
            result += " [EXPLICIT]";
        }
        return result;
    }
}