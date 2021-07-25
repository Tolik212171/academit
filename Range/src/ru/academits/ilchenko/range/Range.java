package ru.academits.ilchenko.range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double checkedNumber) {
        return checkedNumber >= from && checkedNumber <= to;
    }

    public Range getIntersection(Range range){
        if (range.to <= from || range.from >= to) {
            return null;
        }

        return new Range (Math.min(range.from, from), Math.max(range.to, to));
    }
}