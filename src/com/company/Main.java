package com.company;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
        ball b=new ball(4.0,3.5);
        System.out.println(b.getX());
        System.out.println(b.getY());
        b.setX(5.6);
        b.setY(1.5);
        System.out.println(b.getX());
        System.out.println(b.getY());
        b.setXY(5.1,4.0);
        b.move(1.0,2.4);
        System.out.println(b);
    }
}
