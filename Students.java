package Class5_of_POO.Class6_of_POO;

import java.util.Scanner;

public class Students {
    // Attributes
    String name, lastname, subject;
    float[] grades;
    float average;

    //constructor
    public Students(String name, String lastname, String subject, float[] grades, float average) {
        this.name = name;
        this.lastname = lastname;
        this.subject = subject;
        this.grades = grades;
        this.average = average;
    }

    //metodo getters
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSubject() {
        return subject;
    }

    public float[] getGrades() {
        return grades;
    }

    public float getAverage() {
        return average;
    }

    //metodo setters

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setGrades(float[] grades) {
        this.grades = grades;
    }

    public void setAverage(float average) {
        this.average = average;
    }
    
    // Methods

    public void printAverage(){
        float[] arr = getGrades(); 
        float sum = 0, av;

        for(int i = 0; i < 5; i++){
            sum += arr[i];
        }

        av = sum/arr.length;
        System.out.println("El promedio de las calificaciones es: " + av);
    }
}