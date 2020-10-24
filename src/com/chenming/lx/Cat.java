package com.chenming.lx;

public class Cat {
    String color;
    int age;
    String Pz="HuiMao";
    public Cat(String color,int age){
        this.color=color;
        this.age=age;
    }
    public void run(){
        System.out.printf(this.color+"的"+this.Pz+"猫在跑"+this.age);
    }

    public static void main(String[] args) {
        Cat c=new Cat("绿色",15);
        c.run();

    }
}
