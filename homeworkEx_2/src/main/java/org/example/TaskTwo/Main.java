package org.example.TaskTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DivisionByZeroException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers: ");
        int numberOne = Integer.parseInt(scanner.next());
        int numberTwo = Integer.parseInt(scanner.next());
        if (numberTwo == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        System.out.println(numberOne / numberTwo);
    }
}
