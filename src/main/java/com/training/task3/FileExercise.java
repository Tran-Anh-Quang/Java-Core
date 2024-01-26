package com.training.task3;

import java.io.*;

public class FileExercise {

    public static boolean appendFiles(String file1Path, String file2Path, String outputPath) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1Path));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2Path));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath, true))) {

            String line;
            while ((line = reader1.readLine()) != null) {
                writer.write(line + System.lineSeparator());
            }

            while ((line = reader2.readLine()) != null) {
                writer.write(line + System.lineSeparator());
            }
            return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void readFirstThreeLines(String filePAth){
        try (BufferedReader reader = new BufferedReader(new FileReader(filePAth))){
            String line;
            int lineCount = 0;

            while ((line = reader.readLine()) != null && lineCount <3){
                System.out.println(line);
                lineCount++;
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void runFileExercise(){
        String file1Path = "C:\\Users\\dinos\\Downloads\\file2.txt";
        String file2Path = "C:\\Users\\dinos\\Downloads\\file1.txt";
        String outputPath = "C:\\Users\\dinos\\Downloads\\output_file.txt";

        boolean success = appendFiles(file1Path, file2Path, outputPath);

        if (success) {
            System.out.println("Append files successful, please check the link below: ");
            System.out.println("Output file path: file://" + outputPath.replace("\\", "/"));
        } else {
            System.out.println("Append files failed.");
        }

        String filePath = "C:\\Users\\dinos\\Downloads\\output_file.txt";
        System.out.println("The output after read the first three lines of file: ");
        readFirstThreeLines(filePath);
    }
}
