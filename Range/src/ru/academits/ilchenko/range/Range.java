package ru.academits.ilchenko.range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double checkedNumber) {
        return checkedNumber >= from && checkedNumber <= to;
    }

    public Range getIntersection(Range range) {
        if (range.to <= from || range.from >= to) {
            return null;
        }

        return new Range(Math.max(range.from, from), Math.min(range.to, to));
    }

    public Range[] getUnion(Range range) {
        if (range.to < from || range.from > to) {
            return new Range[]{new Range(range.from, range.to), new Range(from, to)};
        }

        return new Range[]{new Range(Math.min(range.from, from), Math.max(range.to, to))};
    }

    public Range[] getDifference(Range range) {
        if (range.from > from && range.to >= to && range.from < to) {
            return new Range[]{new Range(from, range.from)};
        }

        if (range.from > from && range.to < to) {
            return new Range[]{new Range(from, range.from), new Range(range.to, to)};
        }

        if (range.from <= from && range.to < to && range.to > from) {
            return new Range[]{new Range(range.to, to)};
        }

        if (range.from >= to || range.to <= from) {
            return new Range[]{this};
        }

        return new Range[]{};
    }
}