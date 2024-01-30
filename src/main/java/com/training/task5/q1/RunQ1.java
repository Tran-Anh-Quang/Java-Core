package com.training.task5.q1;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.Enumeration;

public class RunQ1 {
    public static void runQ1() throws IOException, ClassNotFoundException {

        // Liệt kê các class trong package và class cha của chúng
        System.out.print("Các class trong package: ");
        Package animalPackage = Animal.class.getPackage();
        String packageName = animalPackage.getName();
        System.out.println(packageName + " là");


        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = classLoader.getResources(path);

        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            if (resource != null) {
                String protocol = resource.getProtocol();
                if (protocol.equals("file")) {
                    String[] classNames = new java.io.File(resource.getFile()).list();
                    if (classNames != null) {
                        for (String className : classNames) {
                            if (className.endsWith(".class")) {
                                className = className.substring(0, className.length() - 6);
                                Class<?> cls = Class.forName(packageName + "." + className);
                                System.out.println(cls.getName());
                            }
                        }
                    }
                }
            }
        }

        // Kiểm tra xem các class có phải là abstract hay không
        System.out.println("\nKiểm tra abstract:");
        printAbstractStatus(Animal.class);
        printAbstractStatus(Mammal.class);
        printAbstractStatus(Fish.class);
        printAbstractStatus(Dragon.class);
        printAbstractStatus(Cat.class);
        printAbstractStatus(Shark.class);
        printAbstractStatus(RunQ1.class);

        // Liệt kê thông tin của các thuộc tính trong Cat và Shark
        System.out.println("\nThông tin thuộc tính của Cat:");
        listFields(Cat.class);
        System.out.println("\nThông tin thuộc tính của Shark:");
        listFields(Shark.class);

        // Khởi tạo một object thuộc class Dragon bằng reflection
        try {
            Constructor<?> constructor = Dragon.class.getDeclaredConstructor(String.class, int.class);
            constructor.setAccessible(true);
            Animal dragon = (Animal) constructor.newInstance("Fire Dragon", 100);
            System.out.println("\nDragon created: " + dragon.getClass().getSimpleName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printAbstractStatus(Class<?> clazz) {
        int modifiers = clazz.getModifiers();
        if (Modifier.isAbstract(modifiers)) {
            System.out.println(clazz.getSimpleName() + " là abstract class");
        } else {
            System.out.println(clazz.getSimpleName() + " không phải là abstract class");
        }
    }

    public static void listFields(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Tên: " + field.getName() + ", Kiểu dữ liệu: " + field.getType().getSimpleName());
        }
    }
}
