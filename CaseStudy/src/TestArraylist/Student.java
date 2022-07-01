package TestArraylist;

import java.util.Collection;

public class Student {
    private  String name;
    private  int age;
    private  boolean gender;

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

    public boolean isGender() {
        return gender;
    }

    public Student() {
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public Student(String name,int age, boolean gender){
        this.name = name;
        this.age=age;
        this.gender=gender;

    }
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender ;
    }
}
