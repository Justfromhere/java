//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Завдання 1
        for(int i = 0; i <= 10; i++) {
               if(i > 2) {
                   System.out.print(i);
               }
        }
        System.out.println();

        //Завдання 2
        for(int i = 15; i >= 5; i--) {
            System.out.println(i);
        }

        //Завдання 3
        for(int i = 0; i <= 17; i++) {
            if(i % 2 != 0) {
                System.out.print(i);
            }
        }
        System.out.println();

        //Завдання 4
        for(int i = 2; i <= 256; i *= 2 ) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Завдання 5
        for(int i = 100; i > 0; i /= 2 ) {
            System.out.println(i);
        }

        //Завдання 6
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
            if (i % 3 == 0) {
                System.out.println();
            }
        }

        //Завдання 7
        int n = 5;
        for(int i = 0; i < 8; i++) {

            if(i % 2 == 0) {
                System.out.print(n + " ");
            } else {
                System.out.print("-" + n + " ");
            }
            n *= 2;
        }
        System.out.println();

        //Завдання 8
        int n2 = 11;
        for(int i = 5; i >= 1; i--) {
            for(int j = 1; j < i + 1; j++)
            {
                System.out.print(n2 + " ");
                n2++;
            }
            System.out.println();
        }

        //Завдання 9

        //Завдання 10
        for (int i = 0; i <= 4; i++ ) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(j + " ");
            }
        }
    }
}