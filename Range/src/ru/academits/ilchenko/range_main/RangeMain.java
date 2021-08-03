package ru.academits.ilchenko.range_main;

import ru.academits.ilchenko.range.Range;

import java.util.Arrays;
import java.util.Scanner;

public class RangeMain {
    public static void main(String[] args) {
        Range range1 = new Range(4, 10);

        System.out.println("Диапазон начинается с " + range1.getFrom());
        System.out.println("Диапазон заканчивается " + range1.getTo());
        System.out.println("Длина диапазона: " + range1.getLength());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число для проверки вхождения в диапазон:");
        double checkedNumber = scanner.nextDouble();

        System.out.println("Результат проверки " + range1.isInside(checkedNumber));

        range1.setFrom(5);
        range1.setTo(22);

        System.out.println("Новый диапазон: " + range1);

        Range rangeIntersection = range1.getIntersection(new Range(2, 26));
        System.out.println("Новый диапазон: " + rangeIntersection);

        Range[] unionRange = range1.getUnion(new Range(27, 35));

        System.out.println("Результат объединения диапазонов: " + Arrays.toString(unionRange));

        Range range2 = new Range(1, 7);
        Range[] differenceRange = range2.getDifference(new Range(2, 4));

        System.out.println("Разность дала нулевой результат: " + Arrays.toString(differenceRange));
    }
}