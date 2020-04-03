package HW1;

import java.util.Scanner;

public class Sec2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день: ");
        int day = scanner.nextInt();

        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();

        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        if (isValid(day, month, year)) {
            System.out.println(Together(day, month, year));
        }
        if (!isValid(day, month, year)){
            System.out.println("Такой даты не существует");
        }
    }


    public static String Together(int day,int month, int year){
        int nextDay = day+1;
        int nextMonth = month+1;
        int nextYear = year+1;
        if ((day==31)|| (day == 29 && month == 2)) {
            return Format(1, nextMonth, year);
        } else if (day == 31 && month == 12) {
            return Format(1, 1, nextYear);
        } else {
            return Format(nextDay, month, year);
        }

    }
    public static String Format(int day, int month, int year){
        return day + "." + month + "." + year;
    }

    public static boolean isValid ( int day, int month, int year){
        if (day <= 0 || day > 31 || month <= 0 || month>12 || year < 0) {
            return false;
        } else {
            return true;
        }
    }
}