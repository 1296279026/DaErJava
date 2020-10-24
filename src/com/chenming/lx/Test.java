package com.chenming.lx;


public class Test {
    String name;
    int age;
    public Test(String name ,int age){
        this.name=name;
        this.age=age;
    }
    public int t(int a){
        int c;

        c=a*2;
        ;
        return c;
    }

    public static void main(String[] args) {
        Test t=new Test("小花",20);
        int b=t.t(20);
        System.out.println(b);
        System.out.println(t.name);
        System.out.println(t.age);




    }
}
