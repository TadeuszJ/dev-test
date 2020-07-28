package org.tadeusz.jereczek;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task2 implements Task {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        integers.stream()
                .sorted()
                .filter(i -> i < 7)
                .filter(i1 -> integers.stream().anyMatch(i2 -> i1 + i2 == 13))
                .forEach(i -> System.out.println(String.format("%s %s", i, 13 - i)));
    }
}
