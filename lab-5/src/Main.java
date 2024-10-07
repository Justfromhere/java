//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Завдання 1
//            Scanner sc = new Scanner(System.in);
//            int a = sc.nextInt();
//            System.out.println(a*a);
//            String s1,s2;
//            s1 = sc.next();
//            s2 = sc.next();
//            System.out.println(s2 + s1);

        //Завдання 2.1
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        if(num % 2 == 0) {
            System.out.print("Число парне");
        } else {
            System.out.print("Число не парне");
        }

        //Завдання 2.2
        double d1 = input.nextDouble();
        double d2 = input.nextDouble();
        double dSum = d1 / d2;
        System.out.print(dSum);

        //Завдання 2.3
        int monthNum = input.nextInt();
        String season;
        switch (monthNum) {
            case 12:
            case 1:
            case 2:
                season = "Зима";
            break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Літо";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осінь";
                break;
            default:
                season = "Число повинно бути від 1 до 12";
                break;
        }
        System.out.print(season);

        //Завдання 2.4
        int ev = input.nextInt();
        if(ev >= 90 && ev <= 100) {
            System.out.println("Оцінка в 4 бальній системі: 5");
            System.out.println("Оцінка в системі(ABCD): A");
        } else if(ev >= 85 && ev <= 89) {
            System.out.println("Оцінка в 4 бальній системі: 4");
            System.out.println("Оцінка в системі(ABCD): B");
        } else if(ev >= 75 && ev <= 84) {
            System.out.println("Оцінка в 4 бальній системі: 4");
            System.out.println("Оцінка в системі(ABCD): C");
        } else if(ev >= 70 && ev <= 74) {
            System.out.println("Оцінка в 4 бальній системі: 3");
            System.out.println("Оцінка в системі(ABCD): D");
        } else if(ev >= 60 && ev <= 69) {
            System.out.println("Оцінка в 4 бальній системі: 3");
            System.out.println("Оцінка в системі(ABCD): E");
        } else if(ev >= 35 && ev <= 59) {
            System.out.println("Оцінка в 4 бальній системі: 2");
            System.out.println("Оцінка в системі(ABCD): FX");
        } else if(ev >= 1 && ev <= 34) {
            System.out.println("Оцінка в 4 бальній системі: 2");
            System.out.println("Оцінка в системі(ABCD): F");
        } else {
            System.out.println("Не правильне значення");
        }


    }
}