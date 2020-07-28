package org.tadeusz.jereczek;

import java.util.*;
import java.util.stream.Collectors;

public class Task1 implements Task {

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        IntSummaryStatistics summaryStatistics = integers.stream()
                .mapToInt(a -> a)
                .summaryStatistics();

        long count = summaryStatistics.getCount();
        long distinct = integers.stream().distinct().count();
        int min = summaryStatistics.getMin();
        int max = summaryStatistics.getMax();

        String listText = integers.stream()
                .distinct()
                .map(Objects::toString)
                .collect(Collectors.joining(" "));

        System.out.println(String.format("%s%ncount: %s%ndistinct: %s%nmin: %s%nmax: %s", listText, count, distinct, min, max));
    }
}
