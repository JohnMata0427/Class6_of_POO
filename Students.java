package Class5_of_POO.Class6_of_POO;

import java.util.Scanner;

public class Students {
    // Attributes
    String name, lastname;
    String[] subject;
    float[] grades;

    //constructor
    public Students(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    //metodo getters
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String[] getSubject() {
        return subject;
    }

    public float[] getGrades() {
        return grades;
    }

    //metodo setters

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    public void setGrades(float[] grades) {
        this.grades = grades;
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

    public void inputData(){
        Scanner gradeSubject = new Scanner(System.in);
        float[] array = new float[5];
        String[] array2 = new String[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Ingrese la " + (i+1) + "° asginatura: ");
            array2[i] = gradeSubject.nextLine();
            System.out.println("Ingrese la " + (i+1) + "° calificacion: ");
            array[i] = gradeSubject.nextFloat();
            gradeSubject.nextLine();
        }

        setGrades(array);
        setSubject(array2);
    }

    public void printData(){
        float[] array = new float[5];
        String[] array2 = new String[5];

        array = getGrades();
        array2 = getSubject();

        for(int i = 0; i < 5; i++){
            System.out.println("Asignatura: " + array2[i] + "   Calificación: " + array[i]);
        }
    }
}