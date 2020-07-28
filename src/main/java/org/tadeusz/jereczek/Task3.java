package org.tadeusz.jereczek;

import java.util.Scanner;

public class Task3 implements Task {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        int count = 0;
        int lastNumber = 0;
        for (int i = 0; i < quantity * 2; i++) {
            if (i % 2 == 0) {
                int currentNumber = scanner.nextInt();
                if (currentNumber != lastNumber) {
                    count++;
                }
            } else {
                lastNumber = scanner.nextInt();
            }
        }

        System.out.println(count);
    }
}
