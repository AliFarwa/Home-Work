package Review8;

public class Doctor {
    String firstName, lastName;

    String speciality;
    int yearsOfExperiance;

    double salary;

    static boolean degree;


    void printInfo(){
        System.out.println("Docs name is " +firstName+" "+lastName+ " and the speiality is " +speciality);
    }

    Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Doctor(String firstName, String lastName, String speciality) {
        this(firstName, lastName);
        this.speciality = speciality;
    }

    Doctor(String firstName, String lastName, String speciality, int salary) {
        this(firstName, lastName, speciality);
        this.salary = salary;
    }
}

