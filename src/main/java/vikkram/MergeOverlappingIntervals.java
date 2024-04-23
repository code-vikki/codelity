package vikkram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Interval {
    int start;
    int end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MergeOverlappingIntervals {
    public static List<Interval> mergeIntervals(List<Interval> intervals) {
        if (intervals.isEmpty()) {
            return new ArrayList<>();
        }

        Collections.sort(intervals, Comparator.comparingInt(a -> a.start));

        List<Interval> mergedIntervals = new ArrayList<>();
        Interval currentInterval = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval nextInterval = intervals.get(i);

            if (currentInterval.end >= nextInterval.start) {
                // Overlapping intervals, merge them.
                currentInterval.end = Math.max(currentInterval.end, nextInterval.end);
            } else {
                // Non-overlapping interval, add the current merged interval and start a new one.
                mergedIntervals.add(currentInterval);
                currentInterval = nextInterval;
            }
        }

        // Add the last merged interval.
        mergedIntervals.add(currentInterval);

        return mergedIntervals;
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 4));
        intervals.add(new Interval(3, 5));
        intervals.add(new Interval(6, 8));
        intervals.add(new Interval(10, 12));
        intervals.add(new Interval(8, 9));

        List<Interval> mergedIntervals = mergeIntervals(intervals);

        for (Interval interval : mergedIntervals) {
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }
}
