public class MusicPlayerDemo {

    public static void main(String[] args) {

        //playlist nesnesini oluştur
        MusicPlaylist playlist = new MusicPlaylist();

        playlist.addSong("Shape of You-Ed Sheeran");
        playlist.addSong("Save Me-BTS");
        playlist.addSong("Snap-Manifest");
        playlist.addSong("like JENNIE-JENNIE");

        //çalma listesini göster
        System.out.println("== PLAYLIST ==");
        playlist.displayPlaylist();
        System.out.println();

        //güncel şarkıyı göster
        System.out.println("== CURRENT SONG PLAYING ==");
        playlist.displayCurrentSong();
        System.out.println();

        //sıradaki şarkıyı çal
        System.out.println("== NEXT SONG TO PLAY ==");
        playlist.nextSong();
        System.out.println();

        //sıradaki şarkıyı çal
        System.out.println("== NEXT SONG TO PLAY ==");
        playlist.nextSong();
        System.out.println();

        //önceki şarkıyı çal
        System.out.println("== PREVIOUS SONG TO PLAY ==");
        playlist.previousSong();
        System.out.println();

        //"Shape of You" şarkısını sil
        System.out.println("== AFTER REMOVING Shape of You SONG ==");
        playlist.removeSong("Shape of You - Ed Sheeran");
        playlist.displayPlaylist();
        System.out.println();

        //"Snap" şarkısını sil
        System.out.println("== AFTER REMOVING Snap SONG ==");
        playlist.removeSong("Snap - Manifest");
        playlist.displayPlaylist();
    }
}