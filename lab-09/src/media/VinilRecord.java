package media;

public class VinilRecord extends Media {
    public VinilRecord(String name, String author,int year, String comment, double rating) {
        super(name, author, year, comment ,rating);
    }

    @Override
    public String toString() {
        return "VinylRecord{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", comment='" + comment + '\'' +
                ", rating=" + rating +
                '}';
    }
}
