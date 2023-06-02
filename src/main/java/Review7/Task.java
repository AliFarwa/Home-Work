package Review7;

public class Task {
    //We need a method that wil covert  Celcius to Ferin..and return
    // the value

    double temp(double celsius){
       double fahrenheit;
        fahrenheit =((celsius*9)/5)+32;
        return fahrenheit;
    }
    public static void main(String[] args) {
        Task obj=new Task();
        double result=obj.temp(20);
        System.out.println(result);
    }
    // another way
    double convertemp(double cel){
        double f= cel*9/5+32;
        return f;
    }
}
