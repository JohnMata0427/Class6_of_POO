package Class5_of_POO.Class6_of_POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Students studentOne;
        Students studentTwo;
        Students studentThree;

        studentOne = new Students("Carlitos", "Casa");
        studentTwo = new Students("Isabel", "Paredes");
        studentThree = new Students("John", "Puerta");

        studentOne.inputData();
        System.out.println("Estudiante: " + studentOne.getName() +" "+ studentOne.getLastname());
        studentOne.printData();
        studentOne.printAverage();

        studentTwo.inputData();
        System.out.println("Estudiante: " + studentTwo.getName() +" "+ studentTwo.getLastname());
        studentTwo.printData();
        studentTwo.printAverage();

        studentThree.inputData();
        System.out.println("Estudiante: " + studentThree.getName() +" "+ studentThree.getLastname());
        studentThree.printData();
        studentThree.printAverage();
    }
    
}