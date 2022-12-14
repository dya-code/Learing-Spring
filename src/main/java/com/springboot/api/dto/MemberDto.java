package com.springboot.api.dto;

public class MemberDto {

    private String name;
    private String age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "MemberDto{ " +
                "name='" + name + '\'' + ", " +
                "age='" + age + '\'' + ", " +
                "gender='" + gender + '\'' +
                " }";
    }
}