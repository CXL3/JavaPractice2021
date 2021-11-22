package com.clairexilu.javapractice;

public class Player {
    // private--only the method in Player Class can change them
    private String handleName;
    private int lives;
    private int level;
    private int score;

    //create constructor so we can create instances for this Player class

    public Player(){
        //initial value
        handleName = "unknown player";
        lives = 3;
        level = 1;
        score = 0;
    }
    //getter is a method to get the value of a field, type public if you want method outside of the class to use it
    //Get the name
    public String getHandleName() {
        return handleName;
    }

    //change name, return type void- means nothing, param- string


    public void setHandleName(String handle) {
        if (handle.length() < 4 ){
            return;
        }

        handleName = handle;
    }
}
