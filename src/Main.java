public class Main {
    public static void main(String[] args) {
        // Домашнее задание - 1
        System.out.println("Домашнее задание - 1");

        // Задание - 1
        System.out.println("Задача №1");
        int i = 1;
        int salary = 29_000;
        int total = 0;
        while (total < 2_459_000) {
            i = i + 1;
            total = total + salary;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");

        // Задание - 2
        System.out.println("Задача №2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println(" ");
        for (a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println(" ");

        // Задание - 3
        System.out.println("Задача №3");
        int year = 1;
        int population = 12_000_000;
        double birthRate = 0.017;
        double mortalityRate = 0.008;
        for (year = 1; year <= 10; year++) {
            population = population + (int) (population * birthRate) - (int) (population * mortalityRate);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        // Домашнее задание - 2
        System.out.println("Домашнее задание - 2");

        // Задание - 1
        System.out.println("Задача №1");
        int month = 0;
        int input = 15_000;
        int totalSum = 0;
        while (totalSum < 12_000_000) {
            month = month + 1;
            totalSum = (int) ((totalSum + input) * 1.07);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSum + " рублей.");
        }

        // Задание - 2
        System.out.println("Задача №2");
        month = 0;
        totalSum = 0;
        input = 15_000;
        while (totalSum < 12_000_000) {
            month = month + 1;
            totalSum = (int) ((totalSum + input) * 1.07);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSum + " рублей.");
            }
        }

        // Задание - 3
        System.out.println("Задача №3");
        month = 0;
        totalSum = 0;
        input = 15_000;
        while (month <= 12 * 9) {
            month = month + 1;
            totalSum = (int) ((totalSum + input) * 1.07);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSum + " рублей.");
            }
        }

        // Задание - 4
        System.out.println("Задача №4");
        for (int fridayNumber = 1; fridayNumber <= 31; fridayNumber = fridayNumber + 7) { // Если пятница - 1-е, 8-е, 15-е, 22-е и 29-е числа месяца.
            if (fridayNumber % 7 == 1 && fridayNumber <= 31) {
                System.out.println("Сегодня пятница, " + fridayNumber + "-е число. Необходимо подготовить отчет.");
            }
        }


        // Домашнее задание - 3
        System.out.println("Домашнее задание - 3");

        // Задание - 1
        System.out.println("Задача №1");
        int currentYear = 2022;
        int beforeCurrentYear = currentYear - 200;
        int afterCurrentYear = currentYear + 100;
        int cometYear = 0;
        while (cometYear >= 0) {
            cometYear = cometYear + 79;
            if (cometYear >= beforeCurrentYear && cometYear <= afterCurrentYear) {
                System.out.println(cometYear);
            }
        }

        // Задание - 2
        System.out.println("Задача №2");
        int c = 1;
        for (int b = 1; b <= 10; b ++) {;
            c = b * 2;
            System.out.println("2 * " + b + " = " + c);
        }
}}