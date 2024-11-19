import catalog.ArrayCatalog;
import catalog.Catalog;
import ui.Redactor;
import ui.Searcher;
import ui.UserCommunicator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new ArrayCatalog();
        UserCommunicator userCommunicator;
        String mainMenu = """
                Виберіть режим:
                1 - додавання в каталог
                2 - пошук в каталогу
                3 - вихід з програми
                """;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int type;
            while (true) {
                System.out.println(mainMenu);
                if (scanner.hasNextInt()) {
                    type = scanner.nextInt();
                    if (type > 0 && type < 4) {
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
            if (type == 1) {
                userCommunicator = new Redactor(catalog);
            } else if (type == 2) {
                userCommunicator = new Searcher(catalog);
            } else {
                return;
            }
            userCommunicator.run();
        }
    }
}