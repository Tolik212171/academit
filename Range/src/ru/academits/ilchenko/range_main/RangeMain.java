package ru.academits.ilchenko.range_main;

import ru.academits.ilchenko.range.Range;

import java.util.Scanner;

public class RangeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Range range1 = new Range(4, 10);

        System.out.println("Диапазон начинается с " + range1.getFrom());
        System.out.println("Диапазон заканчивается " + range1.getTo());
        System.out.println("Длина диапазона: " + range1.getLength());

        System.out.println("Введите число для проверки вхождения в диапазон:");
        double checkedNumber = scanner.nextDouble();

        System.out.println("Результат проверки " + range1.isInside(checkedNumber));

        range1.setFrom(5);
        range1.setTo(22);

        printRange(range1);

        Range rangeIntersection = range1.getIntersection(new Range(2, 26));
        printRange(rangeIntersection);

        Range[] array1 = range1.getUnion(new Range(27, 35));

        if (array1.length == 1) {
            System.out.println("Результат объединения диапазонов: ");
        } else {
            System.out.println("Результат объединения диапазонов:");
        }
        printRange(array1);

        Range range2 = new Range(1, 7);
        Range[] array2 = range2.getDifference(new Range(1, 5));

        if (array2.length == 0) {
            System.out.println("Разность дала нулевой результат:");
            printRange(array2);
        } else if (array2.length == 1) {
            System.out.println("Результат разности:");
            printRange(array2);
        } else {
            System.out.println("Результат разности:");
            printRange(array2);
        }
    }

    static void printRange(Range[] array1) {
        if (array1.length == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < array1.length; i++) {
                System.out.print((array1[i].toString()));
                if (i < array1.length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
    }

    static void printRange(Range range) {
        System.out.println("Новый диапазон (" + range.getFrom() + ";" + range.getTo() + ")");
    }
}