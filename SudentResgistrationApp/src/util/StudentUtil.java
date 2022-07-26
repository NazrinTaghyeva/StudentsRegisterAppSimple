package util;
import beans.Student;
import main.Config;

public class StudentUtil {
    public static Student fillStudent(){

        String name = util.InputUtil.requireText("Enter the name");
        String surName = util.InputUtil.requireText("Enter the surName");
        int age =  util.InputUtil.requireNumber("Enter the age");
        String className = util.InputUtil.requireText("Enter the className");
        Student std = new Student(name, surName, age, className);
        return std;

    }
    public static void printAllRegisteredStudent() {
        if(Config.students == null){
            return;
        }
        for (int i = 0; i< Config.students.length; i++){
            Student std = Config.students[i];
            System.out.println(std.getFullInfo());
        }
    }
    public static void registerStudents(){
        int count = util.InputUtil.requireNumber("How many student register?");
        Config.students = new Student[count];
        for (int i = 0; i < count; i++) {
            System.out.println((i+1)+".Register");
            Config.students[i] = util.StudentUtil.fillStudent();
        }
        System.out.println("Registration successfully completed...");
        StudentUtil.printAllRegisteredStudent();
    }

    public static  void findStudentsAndPrint(){
        String text = InputUtil.requireText("Type name,surname or className");
        Student[] result = findStudents(text);
        for (int i = 0; i<result.length;i++){
            System.out.println(result[i].getFullInfo());
        }

    }

    public static Student[] findStudents(String text){
        int count = 0;
        for (int i=0;i<Config.students.length;i++){
            Student std = Config.students[i];
            if (std.getName().contains(text) || std.getSurName().contains(text) || std.getClassName().contains(text)){
                count++;
            }
        }
        Student[] result = new Student[count];
        int found=0;
        for (int i=0; i<Config.students.length;i++){
            Student std = Config.students[i];
            if (std.getName().contains(text) || std.getSurName().contains(text) || std.getClassName().contains(text)){
                result[found++] = std;
            }

        }
        return result;
    }

    public static void updateStudent(){
        util.StudentUtil.printAllRegisteredStudent();
        int i = InputUtil.requireNumber("Which student want to update?");
        System.out.println("Enter the new info...");
        Student selectStudent = Config.students[i-1];
        String changeParam = InputUtil.requireText("Which students parameter want to update?");
        if (changeParam.contains("'name'")){
            selectStudent.setName(InputUtil.requireText("name"));
        }
        if (changeParam.contains("'surName'")){
            selectStudent.setSurName(InputUtil.requireText("surName"));
        }
        if (changeParam.contains("'age'")){
            selectStudent.setAge(InputUtil.requireNumber("age"));
        }
        if (changeParam.contains("'className'")){
            selectStudent.setClassName(InputUtil.requireText("className"));
        }

    }


}
