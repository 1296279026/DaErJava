package com.chenming.lx;

import java.util.Random;
import java.util.Scanner;

public class SuiJi {
    public static void main(String[] args) {
        Random rd=new Random();
        int n =rd.nextInt(30);
        Scanner sc=new Scanner(System.in);

        boolean flog=true;
        while (flog){
            System.out.println("请输入你猜的数字");
            int s=sc.nextInt();
            if (s>n){
                System.out.println("猜大了");

            }else if (s<n){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了");
                flog=false;
            }
        }

    }
}
