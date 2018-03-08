package com.yr.JavaCoreProject.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WhoWasFirstGame {
    public static void main(String[] args) {
        System.out.println("Let's begin!");

        ExecutorService egg = Executors.newSingleThreadExecutor();
        ExecutorService chicken = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 100; i++) {
            egg.submit(() -> {
                for (int j = 0; j < 10; j++) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(1);
                    } catch (InterruptedException e) { }
                    System.out.println("Egg");
                }
            });

            chicken.submit(() -> {
                for (int x = 0; x < 10; x++) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(1);
                    } catch (InterruptedException e) { }
                    System.out.println("Chicken");
                }
            });
        }

        egg.shutdownNow();
        chicken.shutdownNow();

        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.print("   - the first was.");
            System.out.println("-------------------------");
            System.out.println("The latest one was the first!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
