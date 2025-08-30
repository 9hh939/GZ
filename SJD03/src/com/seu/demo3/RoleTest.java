package com.seu.demo3;

import java.util.Random;

public class RoleTest {
    public static void main(String[] args) {

        Role role1 = new Role("a",33);
        Role role2 = new Role("b",50);
        while(true){
            role1.attack(role2);
            if(role2.getBlood()==0){
                System.out.println(role1.getName()+"杀害了"+role1.getName());
                break;
            }
            role2.attack(role1);
            if(role1.getBlood()==0){
                System.out.println(role2.getName()+"杀害了"+role1.getName());
                break;
            }
        }
    }
}
