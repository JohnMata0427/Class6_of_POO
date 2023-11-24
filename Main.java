package Class5_of_POO.Class6_of_POO;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Students studentOne;

        Scanner gradeSubject = new Scanner(System.in);
        float[] array= new float[5];

        for(int i=0; i<5; i++){
            System.out.println("Ingrese la " + (i+1) + "° calificacion: ");
            array[i] = gradeSubject.nextFloat();
        }

        studentOne = new Students("Carlitos", "Casa", "Fisica",array);
        studentOne.printAverage();
    }
    
}