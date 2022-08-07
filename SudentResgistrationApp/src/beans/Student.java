package beans;


import util.StudentUtil;

public class Student {
    private String name;
    private String surName;
    private int age;
    private String className;
    public Student() {
    }

    public Student(String name,String surName,int age,String className) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    public String getFullInfo(){
        return this.getName()+" " + this.getSurName() + " " + this.getAge() + " " + this.getClassName();
    }
}
