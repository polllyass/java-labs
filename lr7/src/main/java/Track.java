public class Track {
    private String title;
    private String artist;
    private int duration;

    static int totalTracks = 0;
    static int totalDuration = 0;

    public Track(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;

        totalTracks++;
        totalDuration += duration;
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public int getDuration() { return duration; }

    public static double getAverageDuration() {
        if (totalTracks == 0) return 0;
        return (double) totalDuration / totalTracks;
    }

    public void displayInfo() {
        System.out.println(title + " — " + artist + " (" + duration + " сек)");
    }
}
