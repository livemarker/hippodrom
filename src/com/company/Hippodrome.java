package com.company;

import java.util.*;

//           B:/qq.txt
public class Hippodrome {


    private ArrayList<Horse> horseList;
    static Hippodrome game;

    public ArrayList<Horse> getHorseList() {
        return horseList;
    }

    Hippodrome(ArrayList<Horse> horseList) {
        this.horseList = horseList;
    }

    void run() {
        for (int i = 1; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void move() {
        for (Horse horse : horseList) {
            horse.move();
        }
    }

    void print() {
        for (Horse horse : horseList) {
            horse.print();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("");
        }
    }
    public Horse getWinner(){
        Horse result= horseList.get(0);
        for (Horse horse:horseList){
            if(horse.getDistance()> result.getDistance()){
                result=horse;
            }
        }
        return result;
    }
    public void printWinner(){

        System.out.println(String.format("Winner is %s!",getWinner().getName()));
    }

    public static void main(String[] args) {
        ArrayList<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Rainbow", 3, 0));
        horses.add((new Horse("Spiro", 3, 0)));
        horses.add(new Horse("vasil'", 3, 0));
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }
}









