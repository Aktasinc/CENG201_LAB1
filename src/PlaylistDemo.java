/**
 * PlaylistDemo.java
 * Driver program to test the Track class.
 *
 * Sami Yusuf Aktaş
 * 250444045
 * 5.10.2026
 */

public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("== Playlist Track demo ==\n");


        System.out.println("Default track:");
        Track t1 = new Track();
        System.out.println(t1);
        System.out.println();


        System.out.println("Title only track:");
        Track t2 = new Track("Neon lights");
        System.out.println(t2);
        System.out.println();


        System.out.println("Title + Artist track:");
        Track t3 = new Track("Ocean drive", "Midnight pulse");
        System.out.println(t3);
        System.out.println();


        System.out.println("Full track (non explicit):");
        Track t4 = new Track("Raindrop waltz", "Clara voss", 210, false);
        System.out.println(t4);
        System.out.println();


        System.out.println("Invalid duration test:");
        Track t5 = new Track("Broken clock", "Static noise", -45, false);
        System.out.println(t5);
        System.out.println();


        System.out.println("Getter test:");
        Track t6 = new Track("Stardust", "Stellar echo", 242, true);
        System.out.println("Title:     " + t6.getTitle());
        System.out.println("Artist:    " + t6.getArtist());
        System.out.println("Duration:  " + t6.getDurationFormatted());
        System.out.println("Explicit:  " + t6.isExplicit());
    }
}