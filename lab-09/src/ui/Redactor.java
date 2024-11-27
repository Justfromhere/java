package ui;

import catalog.Catalog;
import media.CompactDisc;
import media.Media;
import media.Tape;
import media.VinilRecord;

public class Redactor extends UserCommunicator {
    public Redactor(Catalog catalog) {
        super(catalog);
    }
    @Override
    public void run(){
        System.out.println("Введіть назву диску, який хочете додати (0 - вихід в головне меню):");
        String name = scanner.nextLine();
        if(name.equals("0")){
            return;
        }
        System.out.println("Введіть автора:");
        String author = scanner.nextLine();
        System.out.println("Введіть рік:");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введіть коментар:");
        String comment = scanner.nextLine();
        System.out.println("Введіть рейтинг:");
        double rating = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Виберіть тип носія:");
        System.out.println("1 - компакт диск");
        System.out.println("2 - вінілова платівка");
        System.out.println("3 - касета");
        int type = scanner.nextInt();
        scanner.nextLine();
        Media media = null;
        if (type == 1) {
            media = new CompactDisc(name, author, year, comment, rating);
        } else if (type == 2) {
            media = new VinilRecord(name, author, year, comment, rating);
        } else if (type == 3) {
            media = new Tape(name, author, year, comment, rating);
        }
        if (media != null) {
            catalog.addMedia(media);
        }

    }
}
