package ca.bcit.winter2021.comp2522.midterm.question5;
import static java.lang.Math.*;

//TODO: complete the definition the class
public class Cylindrical {
    private final int radius;
    private final int height;

    Cylindrical(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    double volumeCylindrical (){
        return this.radius*this.radius*PI*this.height;
    }
}


