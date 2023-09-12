package org.example.TaskThree;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int numberOne = Integer.parseInt(scanner.next());
        int numberTwo = Integer.parseInt(scanner.next());
        int numberThree = Integer.parseInt(scanner.next());
        if (numberOne > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
        if (numberTwo < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
        if (numberOne + numberTwo < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
        if (numberThree == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        System.out.println("Проверка пройдена успешно");
    }

}
