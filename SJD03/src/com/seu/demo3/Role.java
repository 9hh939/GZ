package com.seu.demo3;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    public Role() {
    }
    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String toString() {
        return "Role{name = " + name + ", blood = " + blood + "}";
    }


    public void attack(Role role) {
        //伤害
        Random random = new Random();
        int hurt=random.nextInt(20)+1;
        int remainBlood=role.getBlood();
        role.setBlood(remainBlood>hurt?role.getBlood()-hurt:0);

        System.out.println(this.getName()+"要打死"+role.getName());
        System.out.println("造成了"+hurt+"伤害");
        System.out.println(role.getName()+"还有"+role.getBlood()+"血");
    }

}
