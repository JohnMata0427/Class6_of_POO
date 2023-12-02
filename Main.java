import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Students[] list_students = new Students[10];
        Scanner sc = new Scanner(System.in);
        String name, lastname;

        for(int i = 1; i <= 10; i++){
            System.out.print("\nIngrese el nombre del estudiante " + i + ": ");
            name = sc.nextLine();
            System.out.print("Ingrese el apellido del estudiante " + i + ": ");
            lastname = sc.nextLine();
            list_students[i-1] = new Students(name, lastname);

            list_students[i-1].inputData();
            System.out.println("=====================================");

            System.out.println("\nEstudiante: " + list_students[i-1].getName() +" "+ list_students[i-1].getLastname());
            list_students[i-1].printData();
            list_students[i-1].printAverage();
            System.out.println("\n=====================================");
        }

        while (true){
            System.out.print("\nIngrese el numero del estudiante que desea modificar sus datos: ");
            int num = sc.nextInt();

            while (num <= 0) {
                System.out.print("Ingrese un numero válido (del 1 al 10): ");
                num = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("\nIngrese el nombre del estudiante " + num + ": ");
            name = sc.nextLine();
            System.out.print("Ingrese el apellido del estudiante " + num + ": ");
            lastname = sc.nextLine();

            list_students[num-1].setName(name);
            list_students[num-1].setLastname(lastname);

            list_students[num-1].inputData();
            System.out.println("\n=====================================");
            System.out.println("Estudiante: " + list_students[num-1].getName() +" "+ list_students[num-1].getLastname());
            list_students[num-1].printData();
            list_students[num-1].printAverage();

            System.out.println("\n=====================================");

            System.out.print("\nDesea modificar otro estudiante? (s/n): ");
            String answer = sc.nextLine();

            while(!answer.equals("s") && !answer.equals("n")){
                System.out.print("Ingrese una respuesta válida (s/n): ");
                answer = sc.nextLine();
            }

            if(answer.equals("n")){
                break;
            }
        }

        sc.close();
    }
}