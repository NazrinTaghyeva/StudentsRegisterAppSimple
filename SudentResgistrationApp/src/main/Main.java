package main;

import beans.Student;
import main.Config;
import util.InputUtil;
import util.StudentUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu = 0;
        while(true){
            menu = util.InputUtil.requireNumber("""
                 What do yo do want?
                1.Register student
                2.Show all students
                3.Find student
                4.Update student
                5.Exit""");
            switch (menu) {
                case 1 -> StudentUtil.registerStudents();
                case 2 -> StudentUtil.printAllRegisteredStudent();
                case 3 -> StudentUtil.findStudentsAndPrint();
                case 4 -> StudentUtil.updateStudent();
                case 5 -> System.exit(0);
            }
        }
    }
}
