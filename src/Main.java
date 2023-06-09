import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void checkingTheYear(int year) {
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
        checkingTheYear(year);
    }
    public static void installingTheApp(int clientOS, int clientDeviceYear) {
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
        installingTheApp(clientOS, clientDeviceYear);
    }
    public static int shippingTime(int deliveryDistance) {
        byte numberOfDays = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + numberOfDays);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (numberOfDays + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (numberOfDays + 2));
        } else {
            System.out.println("Доставки нет");
        }
        return numberOfDays;
    }
    public static void task3() {
        System.out.println("Задача3");
        byte deliveryDistance = 59;
        shippingTime(deliveryDistance);
    }
}