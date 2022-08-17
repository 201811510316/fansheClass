package com.ljx.java.pojo;

public class student {

    private String name;
    private Integer age;
    private String job;

    public student() {
    }

    public student(String name, Integer age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void show1(){
        System.out.println("方法1...");
    }
    public void show2(String name){
        System.out.println("方法1..."+name);
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
