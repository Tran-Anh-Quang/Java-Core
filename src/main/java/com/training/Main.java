package com.training;

import com.training.task5.q3.Inject;
import com.training.task6.q2q3.Movie;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.Arrays;

import static com.training.task6.q4q5.StreamAPI.runQ4;

public class Main {
    public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {

//        System.out.println("====================Task #2=======================");
//        runArrayListExercise();
//        runLinkedListExercise();
//        runVectorExercise();
//        runQueueExercise();
//
//        System.out.println("====================Task #3=======================");
//        System.out.println(" ");
//        System.out.println("=========Task #3-String Exercise=========");
//        runQuestionA();
//        runQuestionB();
//        runQuestionC();
//
//        System.out.println(" ");
//        System.out.println("=========Task #3-DateTime Exercise=========");
//        runDateTimeExercise();
//
//        System.out.println(" ");
//        System.out.println("=========Task #3-Thread Exercise=========");
//        createSingleThread();
//        createThreadPoolExecutor();
//        createScheduledThreadPoolExecutor();
//
//        System.out.println(" ");
//        System.out.println("=========Task #3-File Exercise=========");
//        runFileAppendExercise();
//
//        runAddNewStudent();
//        runDeleteStudent();
//        runUpdateStudent();
//        readStudentProfile();

        System.out.println(" ");
        System.out.println("=========Task #5-Reflection Exercise=========");
//        RunQ1.runQ1();

//        ApplicationSettings.loadSettings();
//
//        System.out.println("DataSource URL: " + dataSourceUrl);
//        System.out.println("DataSource Username: " + dataSourceUsername);
//        System.out.println("DataSource Password: " + dataSourcePassword);
//        System.out.println("System Timeout: " + systemTimeout);

//        StudentService studentService = new StudentService();
//        injectDependencies(studentService);
//
//        Student newStudent = new Student();
//        newStudent.setName("John Doe");
//        newStudent.setAge(18);
//        newStudent.setGrade(8.0);
//
//        studentService.insertStudent(newStudent);
//
//        String retrievedStudent = studentService.repository.findByName("John Doe");
//        System.out.println("Inserted Student: " + retrievedStudent);

        System.out.println(" ");
        System.out.println("=========Task #6-Reflection Exercise=========");

        Movie cartoon = Movie::runQ5;
        cartoon.detail("Cartoon movie details: Animated, fun, and imaginative.");

        Movie horror = Movie::runQ5;
        horror.detail("Horror movie details: Suspense, fear, and supernatural elements.");

        Movie action = Movie::runQ5;
        action.detail("Action movie details: Suspense, thrill, and adrenaline rush.");

        runQ4();


    }

    private static void injectDependencies(Object object) {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        Arrays.stream(fields)
                .filter(field -> field.isAnnotationPresent(Inject.class))
                .forEach(field -> {
                    try {
                        if (field.getType().isInterface()) {
                            Class<?> implementationClass = findImplementationClass(field.getType());
                            Object implementationInstance = createInstance(implementationClass);
                            field.setAccessible(true);
                            field.set(object, implementationInstance);

                            injectDependencies(implementationInstance);
                        } else {
                            Object instance = createInstance(field.getType());
                            field.setAccessible(true);
                            field.set(object, instance);

                            injectDependencies(instance);
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });
    }

    private static Class<?> findImplementationClass(Class<?> interfaceClass) {
        String implementationClassName = interfaceClass.getPackage().getName() + ".impl.Jpa" + interfaceClass.getSimpleName() + "Impl";
        try {
            return Class.forName(implementationClassName);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Implementation class not found for interface: " + interfaceClass.getName(), e);
        }
    }

    private static Object createInstance(Class<?> clazz) {
        try {
            return clazz.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException("Failed to create an instance of class: " + clazz.getName(), e);
        }
    }

}

