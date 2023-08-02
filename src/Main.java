public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1:");
        int[] arrayPayments = generateRandomArray();
        int sumOfPayments = 0;
        for (int elements : arrayPayments) {
            sumOfPayments += elements;
        }
        System.out.println("Сумма трат за месяц составила " + sumOfPayments + " рублей");
        System.out.println("==================================================================================");
    }

    public static void task2() {
        System.out.println("Задача 2:");
        int[] arrayPayments = generateRandomArray();
        int minOfPayments = arrayPayments[0];
        int maxOfPayments = arrayPayments[0];
        for (int arrayPayment : arrayPayments) {
            if (arrayPayment < minOfPayments) {
                minOfPayments = arrayPayment;
            }
            if (arrayPayment > maxOfPayments) {
                maxOfPayments = arrayPayment;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minOfPayments + " рублей. Максимальная сумма трат за день составила " + maxOfPayments + " рублей");
        System.out.println("==================================================================================");
    }

    public static void task3() {
        System.out.println("Задача 3:");
        int[] arrayPayments = generateRandomArray();
        float sumOfPayments = 0;
        int days;
        for (days = 0; days < arrayPayments.length; days++) {
            sumOfPayments += arrayPayments[days];
        }
        float average = sumOfPayments / days;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println("==================================================================================");
    }

    public static void task4() {
        System.out.println("Задача 4:");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println("\n==================================================================================");
    }
}



