package com.training.task6.q1;

public interface Animal {
    public abstract void eat();

    public abstract void breath();

    public default void run() {
        System.out.println("running");
    }
}
