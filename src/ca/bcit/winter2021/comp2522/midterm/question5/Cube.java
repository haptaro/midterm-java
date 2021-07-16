package ca.bcit.winter2021.comp2522.midterm.question5;

//TODO: complete the definition the class
public class Cube {
    private final int length;


    public Cube(int width, int length, int height) {
        this.length = length;
    }

    int volumeCube(){
        return this.length^3;
    }
}
