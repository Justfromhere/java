package ui;

import catalog.Catalog;
import media.CompactDisc;
import media.Media;

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
        Media media = new
                CompactDisc(name,author,year,comment,rating);
        catalog.addMedia(media);
    }
}
