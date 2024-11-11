//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Завдання 4
        System.out.println(geometricMean(1.3,2.5));
        System.out.println(geometricMean(1.3,2.5, 3.4));
        System.out.println(geometricMean(1.3,2.5, 3.4, 5.1, 77.7));
        System.out.println(factorial(5));
        System.out.println(factorialLoop(5));
        System.out.println(charFindLoop("Poltava", 'a'));
        System.out.println(charFind("New York", 't',0));
    }
    //Завдання 1
    static double geometricMean(double a, double b) {
        return Math.pow(a*b,1.0/2);
    }

    //Завдання 2
    static double geometricMean(double a, double b, double c) {
        return Math.pow(a*b*c,1.0/2);
    }

    //Завдання 3
    static double geometricMean(double... a) {
        int count = a.length;
        double val = 1.0;
        for(double b : a) {
            val *= b;
        }
        return Math.pow(val,1.0/count);
    }

    //Завдання 5
    static int factorial(int a) {
        if(a==1) {
            return 1;
        } else {
            return a*factorial(a-1);
        }
    }

    static int factorialLoop(int b) {
        int с = 1;
        while (b != 1) {
            с *= b;
            b--;
        }
        return с;
    }

    //Завдання 6
    public static int charFindLoop(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static int charFind(String str, char ch, int index) {
        if (index == str.length()) {
            return 0;
        }
        int count = (str.charAt(index) == ch) ? 1 : 0;
        return count + charFind(str, ch, index + 1);
    }
}