package com.company;

public class Kalitim {

    public static void main(String[] args) {

        Sinif2 s2 = new Sinif2();
        s2.x = 7;
        System.out.println(s2.x);
        s2.metod1();
        Sinif1 s1 = new Sinif1();
    }
}
class Sinif1{
    int x;
    void metod1(){
        System.out.println("Burası metod1");
    }
}
class Sinif2 extends Sinif1{
    int y;
    void metod2(){
        System.out.println("Burası metod2");
    }
}
