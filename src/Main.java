import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        checkIsLeapYear(1585);
        checkIsLeapYear(2024);
        System.out.println("Задача 2");
        defineAppVersion(1, 2020);
        defineAppVersion(1, 2024);
        System.out.println("Задача 3");
        System.out.println("Количество дней доставки - " + calcCardDeliveryDays(27));
        System.out.println("Количество дней доставки - " + calcCardDeliveryDays(65));
    }

    public static void checkIsLeapYear(int year) {
        if (year >= 1584 && (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год - високосный год.");
        } else {
            System.out.println(year + " год - невисокосный год.");
        }
    }

    public static void defineAppVersion(int clientOs, int clientDeviceYear) {
        String clientOsName;
        switch (clientOs) {
            case 0:
                clientOsName = "iOS";
                break;
            case 1:
                clientOsName = "Android";
                break;
            default:
                clientOsName = "неизвестная OS";
        }
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear != currentYear) {
            System.out.println("Для ОС " + clientOsName + " установите облегченную версию");
        } else {
            System.out.println("Для ОС " + clientOsName + " установите обычную версию");
        }
    }

    public static int calcCardDeliveryDays(int distance) {
        int deliveryDays;
        if (distance <= 20) {
            deliveryDays = 1;
        } else if (distance <= 60) {
            deliveryDays = 2;
        } else {
            deliveryDays = 3;
        }
        return deliveryDays;
    }
}