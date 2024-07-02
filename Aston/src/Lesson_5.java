import java.util.Arrays;
import java.util.Scanner;

public class Lesson_5 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        intInput();
        intPositive(10);
        intNegative(-1);
        stringRepeat("Test ", 5);
        yearV(2000);
        arrayRev();
        arrayFill();
        arrayMult();
        arrayQuad();
        arrayLIV(5, 6);
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = 0;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 0;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static void intInput() {
        Scanner intInput = new Scanner(System.in);
        System.out.print("Input 1st number: ");
        int num1 = intInput.nextInt();
        System.out.print("Input 2nd number: ");
        int num2 = intInput.nextInt();
        boolean summ = (num1 + num2) > 10 && (num1 + num2) <= 20;
        System.out.println(summ);
    }

    public static void intPositive(int x) {
        if (x >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static void intNegative(int x) {
        boolean neg = x < 0;
        System.out.println(neg);
    }

    public static void stringRepeat(String x, int y) {
        System.out.println(x.repeat(y));
    }

    public static void yearV(int year) {
        if (year % 400 == 0) {
            System.out.println("true");
        } else if (year % 100 == 0) {
            System.out.println("false");
        } else if (year % 4 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void arrayRev() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Было: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println("Стало: " + Arrays.toString(array));
    }

    public static void arrayFill() {
        int[] array = new int[100];
        int i = 0;
        while (i < 100) {
            array[i] = 1 + i;
            i++;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void arrayMult() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Было: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println("Стало: " + Arrays.toString(array));
    }

    public static void arrayQuad() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0, x = array[i].length - 1; j < array[i].length; j++, x--) {
                if (i == j || i == x) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void arrayLIV(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
    }
}

