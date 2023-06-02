package Hw14;

public class Student {
    /*Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F */

    int getGrade(int Score) {

        if (Score >= 90) {
            return 'A';
        } else if (Score >= 80) {
            return 'B';
        } else if (Score >= 70) {
            return 'C';
        } else if (Score >= 50) {
           return 'D';
        } else {
           return 'F';
        }
    }
    public static void main(String[] args) {

        Student obj = new Student();
       int score = 95;
       char result= (char) obj.getGrade(score);
      System.out.println(result);


    }

}
