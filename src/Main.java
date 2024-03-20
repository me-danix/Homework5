public class Main {
    @SuppressWarnings("ConstantValue")
    public static void main(String[] args) {

        // Задача 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Зайдите с Android или iOS устройства");
        }

        // Задача 2
        clientOS = 0;
        int year = 2010;
        if (clientOS == 0) {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Зайдите с Android или iOS устройства");
        }

        // Задача 3
        year = 2024;
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задача 4
        int days = 0;
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + (days + 1));
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (days + 2));
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (days + 3));
        } else {
            System.out.println("Доставка не осуществляется");
        }

        // Задача 5
        int monthNumber = 10;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Зимний сезон");
                break;
            case 3, 4, 5:
                System.out.println("Весенний сезон");
                break;
            case 6, 7, 8:
                System.out.println("Летний сезон");
                break;
            case 9, 10, 11:
                System.out.println("Осенний сезон");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}