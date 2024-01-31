package com.training.task6.q6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RunQ6 {
    public static void runQ6(){
        List<People> peopleList = new ArrayList<>();
        peopleList.add(new People("Alice"));
        peopleList.add(new People("Bob"));
        peopleList.add(null);

        for (People person : peopleList) {
            Optional<People> optionalPerson = Optional.ofNullable(person);
            String name = optionalPerson.map(People::getName).orElse("Unknown");
            System.out.println("Name: " + name);
        }
    }
}
