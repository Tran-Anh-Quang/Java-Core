package com.training;

import java.text.ParseException;

import static com.training.task2.Collection.*;
import static com.training.task3.DateTime.runDateTimeExercise;
import static com.training.task3.StringExercise.*;
import static com.training.task3.ThreadExercise.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        System.out.println("====================Task #2=======================");
        runArrayListExercise();
        runLinkedListExercise();
        runVectorExercise();
        runQueueExercise();

        System.out.println("====================Task #3=======================");
        System.out.println(" ");
        System.out.println("=========Task #3-String Exercise=========");
        runQuestionA();
        runQuestionB();
        runQuestionC();

        System.out.println(" ");
        System.out.println("=========Task #3-DateTime Exercise=========");
        runDateTimeExercise();

        System.out.println(" ");
        System.out.println("=========Task #3-Thread Exercise=========");
        createSingleThread();
        createThreadPoolExecutor();
        createScheduledThreadPoolExecutor();

    }

}

