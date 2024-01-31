package com.training.task6.q2q3;
@FunctionalInterface
public interface Movie {

    public abstract void detail(String s);

    static void runQ5(String s) {
        System.out.println(s);
    }
}
