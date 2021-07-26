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

        System.out.println("Новый диапазон от " + range1.getFrom() + " до " + range1.getTo());

        range1 = range1.getIntersection(new Range(2, 26));
        System.out.println("Новый диапазон от " + range1.getFrom() + " до " + range1.getTo());

        Range[] array1 = range1.getUnion(new Range(27, 35));

        if (array1.length == 1) {
            System.out.println("Результат объединения диапазонов, новый диапазон от "
                    + array1[0].getFrom() + " до " + array1[0].getTo());
        } else {
            for (int i = 0; i < array1.length; i++) {
                System.out.println("Результат объединения диапазонов, новый диапазон " + (i + 1) + " куска " + "от "
                        + array1[i].getFrom() + " до " + array1[i].getTo());
            }
        }

        Range range2 = new Range(1, 7);
        Range[] array2 = range2.getDifference(new Range(3, 5));

        if (array2.length == 0) {
            System.out.println("Разность дала нулевой результат");
        } else if (array2.length == 1) {
            System.out.println("Результат разности, новый диапазон:                                                                        й диапазон от "
                    + array2[0].getFrom() + " до " + array2[0].getTo());
        } else {
            for (int i = 0; i < array1.length; i++) {
                System.out.println("Результат разности, новый диапазон: " + (i + 1) + " куска " + "от "
                        + array2[i].getFrom() + " до " + array2[i].getTo());
            }
        }
    }
}