package Practice1;

public class SyntaxEmployee {
    /*Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects */


    int empID;
    int salary;
    static String CEO = "Sumair";

    public static void main(String[] args) {
        SyntaxEmployee employeeOne = new SyntaxEmployee();
        employeeOne.empID = 45632;
        employeeOne.salary = 100000;
        employeeOne.CEO = "Sumair";


        SyntaxEmployee employeeTwo = new SyntaxEmployee();
        employeeTwo.empID = 32453;
        employeeTwo.salary = 125000;
        employeeTwo.CEO = "Sumair";


    }
}