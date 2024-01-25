package com.training.task3;

import java.util.List;

public class StringExercise {

    public static String questionA(List<String> stringList){
        StringBuilder result = new StringBuilder();

        for (String i : stringList){
            result.append(i).append(" ");
        }

        if (!result.isEmpty()){
            result.deleteCharAt(result.length() -1);
        }

        return result.toString();
    }

    public static void runQuestionA(){
        List<String> stringList = List.of("Nguyễn", "Văn", "A");
        String result = questionA(stringList);
        System.out.println("Kết quả nối chuỗi từ danh sách: " + result);
    }

    public static String questionB(String fullName) {
        String[] parts = fullName.split("\\s+");

        if (parts.length == 0) {
            return "";
        }

        StringBuilder acronym = new StringBuilder();
        acronym.append(parts[0].charAt(0));

        for (int i = 1; i < parts.length; i++) {
            acronym.append(parts[i].charAt(0));
        }

        return acronym.toString().toUpperCase();
    }

    public static void runQuestionB(){
        String fullName = "Nguyễn Văn A";
        String tenVietTat = questionB(fullName);
        System.out.println("Tên viết tắt: " + tenVietTat);
    }

    public static String questionC(String fullName) {
        String[] parts = fullName.split("\\s+");

        if (parts.length <= 1) {
            return fullName;
        }

        return parts[0] + " " + parts[parts.length - 1];
    }

    public static void runQuestionC(){
        String fullName = "Nguyễn Trần Văn A";
        String tenSauKhiLoaiBo = questionC(fullName);
        System.out.println("Tên sau khi loại bỏ tên đệm: " + tenSauKhiLoaiBo);
    }

}
