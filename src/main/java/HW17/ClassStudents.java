package HW17;

public class ClassStudents {
/*Write a java Class Students that have a constructor which takes students name and 3 subject grades. Inside your class also have a method to Calculate Average Grade.
Test Student class for 5 different students with different marks. Your program should print an average mark of each students name.
 */
    String name;
    int mathsMarks;
    int englishMarks;
    int scieneMarks;

    public ClassStudents(String name, int mathsMarks, int englishMarks, int scieneMarks) {
        this.name = name;
        this.mathsMarks = mathsMarks;
        this.englishMarks = englishMarks;
        this.scieneMarks = scieneMarks;
    }

    void averageMArks() {
        int sum = mathsMarks + englishMarks + scieneMarks;
        sum = sum / 3;
        System.out.println("The average marks of " + name + "=" + sum);
    }


}
