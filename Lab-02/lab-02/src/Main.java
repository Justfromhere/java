//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Завдання 1
        int q = 7;
        int w = 3;
        System.out.println("Результат ділення: " + q/w);
        System.out.println("Залишок від ділення: " + q%w);

        //Завдання 2
        int number = 367;
        long numberLong = number;
        short numberShort = (short)number;
        byte numberByte = (byte)number;
        double numberDouble = number;
        System.out.println("int: " + number);
        System.out.println("long: " + numberLong);
        System.out.println("short: " + numberShort);
        System.out.println("byte: " + numberByte);
        System.out.println("double: " + numberDouble);

        //Завдання 3
        float a = 3.5f;
        float b = 7.8f;
        float c = 4.3f;
        System.out.println("Результат обчислення: " +(7*b+a)/c);

        //Завдання 4
        long result = (long) ((7*b+a)/c);
        System.out.println(result);

        //Завдання 5
        int r = 349;

        int sum = (r / 100) + (r / 10 % 10) + (r % 10);
        System.out.println("Сума числа: " + sum);

        //Завдання 6
        for (int i = 100; i < 1000; i++) {
            System.out.println(i);
        }

        //Завдання 7
        int t = 24;

        if(t % 2 == 0) {
            System.out.println("Змінна парна");
        } else {
            System.out.println("Змінна не парна");
        }

        //Завдання 8
        int l = 12345;

        int a1 = l / 10000;
        int b1 = (l / 100) % 10;
        int c1 = l % 10;

        int sumNumbers = a1 + b1 + c1;

        //Завдання 9
        int j = (int) Math.sqrt(sumNumbers);
        System.out.println(j);

        //Завдання 10
        int k = 12345;
        int sumEvenDigits = 0;

        while (k > 0) {
            int digit = k % 10;
            if (digit % 2 == 0) {
                sumEvenDigits += digit;
            }
            k /= 10;
        }

        System.out.println("Сума парних: " + sumEvenDigits);
    }
}