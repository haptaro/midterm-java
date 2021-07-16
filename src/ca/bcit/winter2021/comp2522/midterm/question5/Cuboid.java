package ca.bcit.winter2021.comp2522.midterm.question5;

import static java.lang.Math.PI;

//TODO: complete the definition the class
public class Cuboid {
    private final int length;
    private final int width;
    private final int height;

    Cuboid(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    int volumeCuboid(){
        return this.width*this.length*this.height;
    }

}
