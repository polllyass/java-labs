public class Lab7 {
    public static void main(String[] args) {
        Track t1 = new Track("Hypnotised", "Coldplay", 333);
        Track t2 = new Track("Be Quiet and Drive", "Deftones", 304);
        Track t3 = new Track("D>E>A>T>H>M>E>T>A>L", "Panchiko", 253);
        Track t4 = new Track("The Tourist", "Radiohead", 315);
        Track t5 = new Track("You'll Never Get Over Me", "a-ha", 323);
        Track t6 = new Track("Waking Hour", "The Gathering", 324);

        t1.displayInfo();
        t2.displayInfo();
        t3.displayInfo();
        t4.displayInfo();
        t5.displayInfo();
        t6.displayInfo();

        System.out.println("всего треков: " + Track.totalTracks);
        System.out.println("общая длительность: " + Track.totalDuration + " сек");
        System.out.println("средняя длительность: " + Track.getAverageDuration() + " сек");
    }
}
