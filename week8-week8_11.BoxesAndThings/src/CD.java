public class CD implements ToBeStored {

    private String artist;
    private String title;
    private int publishingYear;
    private final double WEGHT;

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
        WEGHT = 0.1;
    }

    @Override
    public double weight() {
        return this.WEGHT;
    }

    @Override
    public String toString() {
        return artist + ": " + title + " (" + publishingYear + ")";
    }
}
