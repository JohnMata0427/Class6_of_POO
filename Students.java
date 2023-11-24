package Class5_of_POO.Class6_of_POO;

public class Students {
    // Attributes
    String name, lastname, subject;
    float grades[]; 
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
}
