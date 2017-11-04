package com.techcetro.mvpdemo;

/**
 * Created by RK LAMA on 10/12/2017.
 */

public class User {
    private String gender;
    private int age;
    private String name;

    public User(String gender, int age, String name) {
        this.gender = gender;
        this.age = age;
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
