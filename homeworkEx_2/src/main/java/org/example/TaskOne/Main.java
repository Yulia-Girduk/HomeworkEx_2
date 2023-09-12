package org.example.TaskOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidNumberException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input number: ");
    int a = Integer.parseInt(scanner.next());
    if (a <= 0) {
        throw new InvalidNumberException("Некорректное число");
    }
    System.out.println("Число корректно");
}
}
