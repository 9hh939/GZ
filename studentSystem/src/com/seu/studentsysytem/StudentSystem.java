package com.seu.studentsysytem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        loop: while (true) {

            System.out.println("************热烈欢迎啊*************");
            System.out.println("1:add");
            System.out.println("2:delete");
            System.out.println("3:update");
            System.out.println("4:find");
            System.out.println("5:exit");
            System.out.println("输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String choose =sc.next();
            switch (choose){
                case "1"-> add(students);
                //case "2"-> delete();
                //case "3"-> update();
                case "4"-> find(students);
                case "5"-> {
                    System.out.println("exit...");
                    System.exit(0);
                }
                default ->  System.out.println("选啥呢你");
            }
        }

    }

    //1.
    public static void add(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("加人类...");
        System.out.println("请输入id：");
        String id = sc.next();
        while (true) {
            if(contains(list,id)){
                System.out.println("id已存在，请重新输入：");
            }
            else {
                break;
            }
            id=sc.next();
        }



        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入家庭住址：");
        String address = sc.next();
        Student newStudent=new Student(id,name,age,address);
        list.add(newStudent);
        System.out.println("添加成功");

        }

    //2
    public static void delete(ArrayList<Student> list, Student student) {
        System.out.println("删人");
    }

    //3
    public static void update(){
        System.out.println("修改");
    }

    //4
    public static void find(ArrayList<Student> list) {
        System.out.println("查询");
        if (list.size() == 0) {
            System.out.println("当前没有学生信息，请add");
            return;
        }
        System.out.println("id\t姓名\t年龄\t家庭地址");
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAddress());
        }
    }

    public static boolean contains(ArrayList<Student> list,String id)
    {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id))
                return true;
        }
        return false;
    }
}

