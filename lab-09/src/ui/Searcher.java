package ui;

import catalog.Catalog;
import media.Media;

public class Searcher extends UserCommunicator {
    public Searcher(Catalog catalog) {
        super(catalog);
    }

    private String menu = """
            Шукати по
            1 - назві
            2 - автору
            3 - року
            4 - діапазону років
            5 - рейтингу 
            6 - показати все
            """;
    private String secondMenu = """
            Спробувати ще?
            1 - так
            2 - ні, перейти до меню вибору
            3 - ні, перейти до головного меню
            """;

    @Override
    public void run() {
        System.out.println(menu);
        int type;
        while (true) {
            if (scanner.hasNextInt()) {
                type = scanner.nextInt();
                if (type > 0 && type < 7) {
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Виберіть варіант від 1 до 6 ...");
                }
            } else {
                System.out.println("Потрібно ввести число від 1 до 6 ...");
            }
            scanner.nextLine();
        }
        if (type == 1) {
            searchByName();
        } else if (type == 2) {
            searchByAuthor();
        } else if (type == 3) {
            searchByYear();
        } else if (type == 4) {
            searchByYears();
        } else if (type == 5) {
            searchByRating();
        } else {
            printAll();
        }
    }

    private int secondMenu() {
        System.out.println(secondMenu);
        int variant;
        while (true) {
            if (scanner.hasNextInt()) {
                variant = scanner.nextInt();
                if (variant > 0 && variant < 4) {
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Виберіть варіант від 1 до 3 ...");
                }
            } else {
                System.out.println("Потрібно ввести число від 1 до 3 ...");
            }
            scanner.nextLine();
        }
        return variant;
    }

    private void searchByName() {
        System.out.println("Введіть назву:");
        String name = scanner.nextLine();
        Media[] result = catalog.getByName(name);
        printResult(result);
        int variant = secondMenu();
        if (variant == 1) {
            searchByName();
        } else if (variant == 2) {
            run();
        } else if (variant == 3) {
            return;
        }
    }

    private void searchByAuthor() {
        System.out.println("Введіть автора");
        String author = scanner.nextLine();
        Media[] result = catalog.getByAuthor(author);
        printResult(result);
        int variant = secondMenu();
        if (variant == 1) {
            searchByAuthor();
        } else if (variant == 2) {
            run();
        } else if (variant == 3) {
            return;
        }
    }

    private void searchByYear() {
        System.out.println("Введіть рік:");
        int year;
        while (true) {
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                break;
            } else {
                System.out.println("Потрібно ввести число (рік)");
            }
            scanner.nextLine();
        }
        Media[] result = catalog.getByYear(year);
        printResult(result);
        int variant = secondMenu();
        if (variant == 1) {
            searchByYear();
        } else if (variant == 2) {
            run();
        } else if (variant == 3) {
            return;
        }
    }

    private void searchByYears() {
        System.out.println("Введіть роки:");
        int fromYear;
        int toYear;
        while (true) {
            if (scanner.hasNextInt()) {
                fromYear = scanner.nextInt();
                toYear = scanner.nextInt();
                break;
            } else {
                System.out.println("Потрібно ввести число (рік)");
            }
            scanner.nextLine();
        }
        Media[] result = catalog.getByYear(fromYear, toYear);
        printResult(result);
        System.out.println("TEST");
        int variant = secondMenu();
        if (variant == 1) {
            searchByYears();
        } else if (variant == 2) {
            run();
        } else if (variant == 3) {
            return;
        }

    }

    private void searchByRating() {
        System.out.println("Введіть рейтинг від 0,0 до 10:");
        double fromRating;
        double toRating;
        while (true) {
            if (scanner.hasNextDouble()) {
                fromRating = scanner.nextDouble();
                toRating = scanner.nextDouble();
                break;
            } else {
                System.out.println("Потрібно ввести число (рейтинг)");
            }
            scanner.nextLine();
        }
        Media[] result = catalog.getByRating(fromRating, toRating);
        printResult(result);

        int variant = secondMenu();
        if (variant == 1) {
            searchByRating();
        } else if (variant == 2) {
            run();
        } else if (variant == 3) {
            return;
        }

    }

    private void printAll() {
        printResult(catalog.getAll());
    }

    private void printResult(Media[] result) {
        if (result.length == 0) {
            System.out.println("Нічого не знайдено:(");
        }
        for (Media media : result) {
            System.out.println(media);
        }
    }
}


