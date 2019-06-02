package com.less4task2Package;

public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        int advThis = 0;
        int advAnother = 0;

        // add the advantage counter for boxer's characteristics
        if (this.age <= anotherBoxer.age) {
            advThis++;}
            else{
                advAnother++;}
        if (this.weight >= anotherBoxer.weight){
            advThis++;
            }else {
                advAnother++;}
        if (this.strength >= anotherBoxer.strength) {
            advThis++;
            }else{
                   advAnother++;}


        return advThis > advAnother;

    }

}
