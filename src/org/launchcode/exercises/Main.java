package org.launchcode.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Main extends Exception{

    public static void main(String[] args) {

        // Test out your Divide() function!
//        Divide(1, 0);
        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");
        HashMap<String, Integer> studentGrades = new HashMap<>();
        ArrayList<String> studentNames = new ArrayList<>(studentFiles.keySet());
        for (String studentName : studentNames) {
            if (studentFiles.get(studentName).length() > 0) {
                studentGrades.put(studentName, CheckFileExtension(studentFiles.get(studentName)));
            } else {
                studentGrades.put(studentName, (-1));
            }
            System.out.println(studentName + ": "+ studentGrades.get(studentName)+" pts");
        }


        // Test out your CheckFileExtension() function!
//        for(int i=0;i<studentFiles.size();i++){
//            if(studentFiles.get(studentNames.get(i)).length()!=0) {
//                studentGrades.put(studentFiles.get(i).key,CheckFileExtension(studentFiles.get(i)));
//                    CheckFileExtension(studentFiles.get(i));
//                } else{
//
//                }
//
//        }


    }

    public static void Divide(int x, int y) {
        if (y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by zero!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        } else {
            int divided = x / y;
        }
    }

    public static int CheckFileExtension(String fileName) {
        int gradeValue;
        int fileLength=fileName.length();
        if(fileLength == 0){
            try{
                throw new ArithmeticException("No file submitted");
            } catch(ArithmeticException e){
                gradeValue = -1;
                e.printStackTrace();
            }
        } else if (fileName.contains(".java")){
            gradeValue = 1;
        } else {gradeValue = 0;}
            return gradeValue;
        // Write code here!
    }

}
