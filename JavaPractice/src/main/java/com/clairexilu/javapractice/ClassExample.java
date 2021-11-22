package com.clairexilu.javapractice;

public class ClassExample {
    public static void main(String[] args) {
        int lives = 3;
        boolean isGameOver =(lives <1 );
        System.out.println(isGameOver);

        if(isGameOver) {
            System.out.println("Game over!");
        } else{
            System.out.println("You are still alive!");
        }

    }
}
