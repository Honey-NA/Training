public class Lesson_9 {
    private static String[][] arr1 = {{"1", "2", "3"}, {"1", "2", "3"}, {"1", "2", "3"}};
    private static String[][] arr2 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "в", "4"}};
    private static String[][] arr3 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

    public static void main(String[] args) {
        System.out.println("\nМассив arr1");
        try {
            System.out.println("Сумма всех элементов массива = " + arraySum(arr1));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e);
            System.out.println("Вычислить сумму невозможно");
        }
        System.out.println("\nМассив arr2");
        try {
            System.out.println("Сумма всех элементов массива = " + arraySum(arr2));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e);
            System.out.println("Вычислить сумму невозможно");
        }
        System.out.println("\nМассив arr3");
        try {
            System.out.println("Сумма всех элементов массива = " + arraySum(arr3));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e);
            System.out.println("Вычислить сумму невозможно");
        }
    }

    public static int arraySum(String[][] str) throws RuntimeException {
        int sum = 0;
        if (str.length != 4 || str[0].length != 4)
            throw new MyArraySizeException("Размерность массива не соответствует условию!");
        for (int y = 0; y < str.length; y++) {
            for (int x = 0; x < str[y].length; x++) {
                try {
                    sum += Integer.parseInt(str[y][x]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ячейку [" + y + "][" + x + "] невозможно конвертировать в число!");
                }
            }
        }
        return sum;
    }
}
