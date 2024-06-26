package inhatc.cse.spring.di.java_config;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private ArrayList<String> Hobbys;
    private double height;
    private double weight;

    public Student(String name, int age, ArrayList<String> hobbys) {
        this.name = name;
        this.age = age;
        Hobbys = hobbys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getHobbys() {
        return Hobbys;
    }

    public void setHobbys(ArrayList<String> hobbys) {
        Hobbys = hobbys;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
