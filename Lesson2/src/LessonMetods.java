public class LessonMetods {
    public static void printThreeWords(String word1, String word2, String word3) {
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
    public static void checkSumSign() {
        int a = 5;
        int b = -3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void compareNumbers() {
        int a = 10;
        int b = 5;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static void printColor() {
        int value = 110;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean isNegative(int number) {
        return number < 0; // Возвращает true, если число отрицательное
    }
    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }
    public static boolean isLeapYear(int year) {
        // Проверяем условия високосного года
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // Год високосный, если он делится на 400
                return year % 400 == 0;
            }
            return true; // Год высокий, если он делится на 4 и не делится на 100
        }
        return false; // Год не високосный
    }
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void printTwoDimensionalArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
    public static void main(String[] args) {
        printThreeWords("Orange", "Banana", "Appel");
        checkSumSign();
        compareNumbers();
        printColor();
        System.out.println(checkSum(5, 5));  // true
        System.out.println(checkSum(8, 5));  // true
        System.out.println(checkSum(3, 8));  // false
        System.out.println(checkSum(10, 15)); // false
        checkNumber(5);
        checkNumber(-3);
        checkNumber(0);
        System.out.println(isNegative(-5));
        System.out.println(isNegative(3));
        System.out.println(isNegative(0));
        printStringMultipleTimes("Привет", 3);
        printStringMultipleTimes("Hello, World!", 2);
        System.out.println(isLeapYear(2020));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2021));
        System.out.println(isLeapYear(2400));
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив:");
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println("Измененный массив:");
        printArray(array);
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
        }
        System.out.println("Заполненный массив:");
        printArray(array2);
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] *= 2;
            }
        }
        System.out.println("Измененный массив:");
        printArray(array3);
        int size = 5;
        int[][] array4 = new int[size][size];
        for (int i = 0; i < size; i++) {
            array4[i][i] = 1;
        }
        System.out.println("Массив с единицами на главной диагонали:");
        printTwoDimensionalArray(array4);
        int len = 5;
        int initialValue = 3;
        int[] resultArray = createArray(len, initialValue);
        printArray(resultArray);
    }
}

