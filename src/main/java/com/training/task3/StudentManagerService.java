package com.training.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagerService {
    public static ArrayList<Student> readStudentsFromFile(String filename) {
        ArrayList<Student> students = new ArrayList<>();
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(", ");
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                double grade = Double.parseDouble(data[2]);
                Student student = new Student(name, age, grade);
                students.add(student);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        return students;

    }

    public static void displayStudents(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (int i = 0; i < students.size(); i++) {
                System.out.println("Student " + (i + 1) + ": " + students.get(i));
            }
        }
    }

    public static void writeStudentsToFile(String filename, ArrayList<Student> students) {
        try {
            FileWriter writer = new FileWriter(filename);
            for (Student student : students) {
                writer.write(student.toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Thêm sinh viên mới
    public static void addStudent(Student student, ArrayList<Student> students) {
        students.add(student);
    }

    // Xóa sinh viên
    public static void removeStudent(int index, ArrayList<Student> students) {
        if (index >= 0 && index < students.size()) {
            students.remove(index);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Cập nhật thông tin sinh viên
    public static void updateStudent(int index, Student newStudent, ArrayList<Student> students) {
        if (index >= 0 && index < students.size()) {
            students.set(index, newStudent);
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public static void readStudentProfile(){
        ArrayList<Student> students = StudentManagerService
                .readStudentsFromFile("C:\\Users\\dinos\\Downloads\\students.txt");
        StudentManagerService.displayStudents(students);
    }

    public static void runAddNewStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Enter student age:");
        int age = scanner.nextInt();

        System.out.println("Enter student grade:");
        double grade = scanner.nextDouble();

        Student newStudent = new Student(name, age, grade);

        ArrayList<Student> students = new ArrayList<>();
                addStudent(newStudent, students);

        writeStudentsToFile("C:\\Users\\dinos\\Downloads\\students.txt", students);

        System.out.println("Student added successfully.");
    }

    public static void runDeleteStudent(){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = readStudentsFromFile("C:\\Users\\dinos\\Downloads\\students.txt");

        displayStudents(students);

        System.out.println("Enter the index of the student you want to delete:");
        int index = scanner.nextInt();

        removeStudent(index, students);

        writeStudentsToFile("C:\\Users\\dinos\\Downloads\\students.txt", students);
    }

    public static void runUpdateStudent(){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = readStudentsFromFile("C:\\Users\\dinos\\Downloads\\students.txt");

        displayStudents(students);

        System.out.println("Enter the index of the student you want to update:");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index >= 0 && index < students.size()) {
            System.out.println("Enter new name:");
            String name = scanner.nextLine();

            System.out.println("Enter new age:");
            int age = scanner.nextInt();

            System.out.println("Enter new grade:");
            double grade = scanner.nextDouble();

            Student updatedStudent = new Student(name, age, grade);

            updateStudent(index, updatedStudent, students);

            writeStudentsToFile("C:\\Users\\dinos\\Downloads\\students.txt", students);

            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }
}
