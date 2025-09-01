package com.seu.demo3;

import java.util.ArrayList;
import java.util.Scanner;

public class aiya {
    public static void main(String[] args) {
        //集合
        ArrayList<Student> list=new ArrayList<>();
        Student s=new Student("sss",66);
        Student s1=new Student("aaa",6);
        Student s2=new Student("bbb",7);
        list.add(s);
        list.add(s1);
        list.add(s2);
        System.out.println(list);
        Scanner sc=new Scanner(System.in);
        list.get(0).setName("xiaomi");
        if(findInfo(list,"sss")) {
            System.out.println("hhhhhh");
        }

    }
    public static boolean findInfo(ArrayList<Student> a,String name){
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getName().equals(name)){
                return true;
            }
        }
        return false;
    }
}
