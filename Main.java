package Class5_of_POO.Class6_of_POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Students studentOne;

        studentOne = new Students("Carlitos", "Casa");
        studentOne.inputData();
        studentOne.printData();
        studentOne.printAverage();
    }
    
}