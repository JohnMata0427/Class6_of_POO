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
        studentFour = new Students("David", "Ventanas");
        studentFive = new Students("Scarlett", "Pisos");


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

        studentFour.inputData();
        System.out.println("Estudiante: " + studentFour.getName() +" "+ studentFour.getLastname());
        studentFour.printData();
        studentFour.printAverage();

        studentFive.inputData();
        System.out.println("Estudiante: " + studentFive.getName() +" "+ studentFive.getLastname());
        studentFive.printData();
        studentFive.printAverage();
    }
}