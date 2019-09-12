package com.enigma.model;

import java.util.Arrays;

public class Car {
    private Integer postX;
    private Integer postY;
    private Integer fuel = 0;
    private final String RIGHT = "R";
    private final String LEFT = "L";
    private final String FORWARD = "F";
    private final String BACK = "B";
    private  char [] commands ;

    public Car(Integer x, Integer y) {
        this.postX = x;
        this.postY = y;
    }
  public void comand(String commands){
      for (int i = 0; i < commands.length(); i++) {
          this.commands = commands.toUpperCase().toCharArray();
      }
  }

    public void fillFuel(int fuel) {
        this.fuel = this.fuel + fuel;
    }

    public void move(String movement) {
        if (movement.equals(RIGHT)) {
            this.postX++;
        } else if (movement.equals(LEFT)) {
            this.postX--;
        } else if (movement.equals(FORWARD)) {
            this.postY++;
        } else if (movement.equals(BACK)) {
            this.postY--;
        }
    }

    public void run(){

        for (int i = 0; i < this.commands.length; i++) {
            if(this.fuel==0){
                System.out.println("bensin habis");
                break;
            }
            move(String.valueOf(this.commands[i]));
            System.out.println(this.commands[i] + getPotition());
            if ((i+1)%3 ==0) {
                this.fuel--;
            }

        }
    }
    public String getPotition(){
        return  "(" + this.postX + "," + this.postY+ ")";
    }

    public String print() {
        return "Car{" +
                "postX=" + postX +
                ", postY=" + postY +
                ", fuel=" + fuel +
                " commands=" + Arrays.toString(commands) +
                '}';
    }
}