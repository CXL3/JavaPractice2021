package com.clairexilu.javapractice;

public class Demo {
    public static void main(String[] args) {
        //create a new object for this player, and store it in this variable
        Player claire = new Player();
        System.out.println(claire.getHandleName());

        claire.setHandleName("Claire");
        System.out.println(claire.getHandleName());



    }
}
