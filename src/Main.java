import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void checkTheYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
  //      return year;
    }
    public static void task1() {
        System.out.println("Задача1");
        int year = 2026;
        checkTheYear(year);
    }
    public static void installTheApp(int clientOS, int clientDeviceYear) {
        int iOs = 0;
        int android = 1;
        int checkYear = 2015;
        if (clientOS == iOs && clientDeviceYear >= checkYear) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientOS == iOs && clientDeviceYear < checkYear){
            System.out.println("Установите упрощённую версию приложения для iOS по ссылке");
        } else if (clientOS == android && clientDeviceYear >= checkYear) {
            System.out.println("Установите обычную версию приложения для android по ссылке");
        } else if (clientOS == android && clientDeviceYear < checkYear)  {
            System.out.println("Установите упрощённую версию приложения для android по ссылке");
        } else {
            System.out.println("У вас другая операционная система");
        }
    }
    public static void task2() {
        System.out.println("Задача2");
        int clientOS = 1;
        int clientDeviceYear = LocalDate.now().getYear();
        installTheApp(clientOS, clientDeviceYear);
    }
    public static int shipTime(int deliveryDistance) {
        byte numberOfDays;

        if (deliveryDistance < 20) {
            numberOfDays = 1;
        } else if (deliveryDistance < 60) {
            numberOfDays = 2;
        } else if (deliveryDistance <= 100) {
            numberOfDays = 3;
        } else {
            numberOfDays = -1;
        }
        return numberOfDays;
    }
    public static void task3() {
        System.out.println("Задача3");
        byte deliveryDistance = 101;
        shipTime(deliveryDistance);
        System.out.println("Потребуется дней: " + shipTime(deliveryDistance));
    }
}