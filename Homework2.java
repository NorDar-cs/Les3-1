package Uravnenije;

import java.util.Scanner;
//         Написать программу, вычисляющую корни квадратного уравнения
//        вида ax ² + bx + c = 0, где a, b и c - вводимые пользователем из консоли
//        данные.
//            Учитывать только реальные корни (в случае отрицательного
//        дискриминанта выводить сообщение пользователю).
//            При решении создать и использовать следующие вынесенные
//        функции:
//            - функция isPositive, определяющая, является ли число
//        положительным
//            - функция isZero, определяющая, является ли число нулём
//            - функция discriminant, вычисляющая дискриминант

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите значение а: ");
        int a = scanner.nextInt();

        System.out.println("Укажите значение b: ");
        int b = scanner.nextInt();

        System.out.println("Укажите значение с: ");
        int c = scanner.nextInt();
         int numberDisk = Discriminant(a, b, c);
         System.out.println(getAnswer(numberDisk, a, b));
    }
    public static int Discriminant(int a, int b, int c){
        int numberDisk = b * b - 4 * a * c;
        return numberDisk;
    }

    public static boolean isPositive(int numberDisk){
        if (numberDisk>0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isZero (int numberDisk){
        if (numberDisk == 0){
            return true;
        } else {
            return false;
        }
    }
    public static String getAnswer(int numberDisk, int a, int b){
        double answer1 = (- b + Math.sqrt (numberDisk) / (2* a));
        double answer2 = (- b - Math.sqrt (numberDisk) / (2* a));
        if (isPositive(numberDisk)){
            return "У данного уравнения два корня:"+ answer1 + "; " + answer2;
        } else if (isZero(numberDisk)){
            return "У данного уравнения один корень:" + answer1;
        } else {
            return "У данного уравнения нет корней.";
        }
    }

}
