package app;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        java.util.Random random = new java.util.Random();

        // Заповнення масиву випадковими числами в діапазоні від -100 до 100
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        // Виведення елементів масиву
        System.out.print("Елементи масиву: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Знаходження суми від'ємних чисел
        int negativeSum = 0;
        for (int number : array) {
            if (number < 0) {
                negativeSum += number;
            }
        }
        System.out.println("Сума від'ємних чисел: " + negativeSum);

        // Знаходження кількості парних і непарних чисел
        int evenCount = 0;
        int oddCount = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);

        // Знаходження найбільшого та найменшого елементів та їх індексів
        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("Найменший елемент: " + min + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + max + " (з індексом " + maxIndex + ")");

        // Знаходження середнього арифметичного чисел після першого від'ємного числа
        boolean negativeFound = false;
        int sumAfterNegative = 0;
        int countAfterNegative = 0;
        for (int number : array) {
            if (negativeFound) {
                sumAfterNegative += number;
                countAfterNegative++;
            }
            if (number < 0) {
                negativeFound = true;
            }
        }
        if (negativeFound) {
            double averageAfterNegative = (double) sumAfterNegative / countAfterNegative;
            System.out.println("Середнє арифметичне чисел після першого від'ємного числа: " + averageAfterNegative);
        } else {
            System.out.println("Від'ємних чисел немає.");
        }
    }
}
