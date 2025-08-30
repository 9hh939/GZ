package com.seu.demo2;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class hhh {
    //+
    public static void main(String[] args) {

        Random rand = new Random();
        int num=rand.nextInt(100)+1;//1-100
        int mynum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("shuru:");
        while (true){

            mynum=sc.nextInt();
            if(mynum==num){
                System.out.println("ok");
                break;
            }
            else if(mynum>num){
                System.out.println("big");
            }
            else if(mynum<num){
                System.out.println("small");
            }
        }

    }
}
