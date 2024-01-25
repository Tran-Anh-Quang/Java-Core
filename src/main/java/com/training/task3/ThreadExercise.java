package com.training.task3;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadExercise {

    public static void createSingleThread() {
        Thread singleThreadExercise = new Thread(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Beep");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        singleThreadExercise.start();
    }

    public static void createThreadPoolExecutor() {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 30; i++) {
            threadPool.execute(() -> {
                try {
                    Thread.sleep(5000);
                    System.out.println("Beep");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        threadPool.shutdown();
    }

    public static void createScheduledThreadPoolExecutor() {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(1);

        scheduledThreadPool.scheduleAtFixedRate(() -> {
            System.out.println("Beep");
        }, 0, 5, TimeUnit.SECONDS);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 'Stop' để kết thúc:");
        String userInput = scanner.nextLine();

        if ("Stop".equalsIgnoreCase(userInput)) {
            scheduledThreadPool.shutdown();
            System.out.println("Thread pool kết thúc.");
        } else {
            System.out.println("Nhập không hợp lệ. Thread pool vẫn chạy.");
        }

        scheduledThreadPool.shutdown();
    }
}
