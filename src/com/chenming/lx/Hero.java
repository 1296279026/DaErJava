package com.chenming.lx;

public class Hero {
    String name;
    String jn_q;
    String jn_w;
    String jn_e;
    String jn_r;
    public Hero(String name ,  String jn_q,  String jn_w,  String jn_e,  String jn_r){
        this.name=name;
        this.jn_q=jn_q;
        this.jn_w=jn_w;
        this.jn_e=jn_e;
        this.jn_r=jn_r;

    }
    public static int sh(int g,int dr){
        int c;
        c=g-dr;
        return c;
    }
    public void sk(){
        System.out.println(this.name+"在上阵杀敌");
        System.out.println(this.jn_q+"是Q技能");
        System.out.println(this.jn_w+"是W技能");
        System.out.println(this.jn_e+"是E技能");
        System.out.println(this.jn_r+"是R技能");
    }
    public static void main(String[] args) {
        Hero h=new Hero("盖亚","小宝剑","护盾","转转转","大宝剑");
        h.sk();

        System.out.println(sh(45,20));
        int _1=0;
        while (_1<10){
            System.out.println("你真棒"+_1);
            _1++;

        }

    }
}
