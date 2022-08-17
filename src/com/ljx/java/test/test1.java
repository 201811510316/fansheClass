package com.ljx.java.test;

import com.ljx.java.pojo.student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class test1 {
//    public static void main(String[] args) {
//        //获取Class对象
//        System.out.println("方法一");
//        student st = new student();
//        //获取对象
//        Class studentClass1 = st.getClass();
//        System.out.println(studentClass1.getName());
//
//        System.out.println("方法二");
//        Class<student> studentClass2 = student.class;
//        System.out.println(studentClass1==studentClass2);
//
//        System.out.println("方法三");
//        try {
//            Class studentClass3 = Class.forName("com.ljx.java.pojo.student");
//            System.out.println(studentClass3==studentClass1);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//    public static void main(String[] args) {
//        try {
//            Class clazz = Class.forName("com.ljx.java.pojo.student");
//
//            System.out.println("**********************所有公有构造方法*********************************");
//            Constructor[] constructors = clazz.getConstructors();
//            for(Constructor c:constructors){
//                System.out.println(c);
//            }
//
//            System.out.println("**********************公有构造方法,并调用*********************************");
//            Constructor constructor = clazz.getConstructor(String.class,Integer.class,String.class);
//            System.out.println(constructor);
//            //调用构造方法
//            constructor.setAccessible(true);
//            Object o = constructor.newInstance("abc", 15, "cf");
//            System.out.println(o.toString());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.ljx.java.pojo.student");

            System.out.println("**********************所有字段*********************************");
            Field[] declaredFields = clazz.getDeclaredFields();
            for(Field f: declaredFields){
                System.out.println(f);
            }

            System.out.println("**********************调用字段*********************************");
            Field name = clazz.getDeclaredField("name");
            //设置字段值
            Object o = clazz.getDeclaredConstructor(null).newInstance();
            //解除私有限定
            name.setAccessible(true);
            name.set(o,"abc");
            //验证
            student s=(student) o;
            System.out.println(s);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
