package ru.academits.ilchenko.range_main;

import ru.academits.ilchenko.range.Range;

import java.util.Scanner;

public class RangeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Range range = new Range(4, 10);

        System.out.println("Диапазон начинается с " + range.getFrom());
        System.out.println("Диапазон заканчивается " + range.getTo());
        System.out.println("Длина диапазона: " + range.getLength());

        System.out.println("Введите число для проверки вхождения в диапазон:");
        double checkedNumber = scanner.nextDouble();

        System.out.println("Результат проверки " + range.isInside(checkedNumber));

        range.setFrom(5);
        range.setTo(22);

        System.out.println("Новый диапазон от " + range.getFrom() + " до " + range.getTo());

        range = range.getIntersection(new Range(2, 26));
        System.out.println("Новый диапазон от " + range.getFrom() + " до " + range.getTo());

    }
}