package media;

public class Tape extends Media{
    public Tape(String name, String author,int year, String comment, double rating) {
        super(name, author, year, comment ,rating);
    }

    @Override
    public String toString() {
        return "Tape{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", comment='" + comment + '\'' +
                ", rating=" + rating +
                '}';
    }
}

