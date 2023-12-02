import java.util.Scanner;

public class Students {
    // Attributes
    String name, lastname;
    String[] subject;
    float[] grades;

    // Constructor
    public Students(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    // Metodo getters
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

    // Metodo setters

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
        float sum = 0, average;

        for(int i = 0; i < 5; i++){
            sum += arr[i];
        }
        average = sum/arr.length;
        System.out.println("El promedio de las calificaciones es: " + average);

        if(average >=7){
            System.out.println("\nUsted aprobo");
        }
        else if(4 < average){
            System.out.println("\nUsted se quedo a supletorios");
        }
        else{
            System.out.println("\nUsted perdio la materia, sorry");
        }
    }

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        float[] array = new float[5];
        String[] array2 = new String[5];
        
        for(int i = 0; i < 5; i++){
            System.out.print("\nIngrese el nombre de la " + (i+1) + "° asginatura: ");
            array2[i] = sc.nextLine();
            System.out.print("Ingrese la " + (i+1) + "° calificacion: ");
            array[i] = sc.nextFloat();

            while(array[i] < 0 || array[i] > 10){
                System.out.print("Ingrese una calificacion válida (del 0 al 10): ");
                array[i] = sc.nextFloat();
            }

            sc.nextLine();
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