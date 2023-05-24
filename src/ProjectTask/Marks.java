package ProjectTask;

public abstract class Marks {
    int averageMarks;
    abstract void getPercentage();

}
class A extends Marks{
 int English;
 int Maths;
 int Science;
 public A( int English, int Maths, int Science){
     this.English=English;
     this.Maths=Maths;
     this.Science=Science;
 }
 @Override
    void getPercentage() {
      averageMarks= English+Maths+Science/3;
     System.out.println("The Average percentage of student A is : " + averageMarks);
    }
}
class B extends Marks{
    int English;
    int Maths;
    int Science;
    int Sociology;
    public B(int English, int Maths, int Science ,int Socioly){
        this.English=English;
        this.Maths=Maths;
        this.Science=Science;
        this.Sociology=Socioly;

    }

    @Override
    void getPercentage() {
        averageMarks= English+Maths+Science+Sociology/4;
        System.out.println("The Average marks of B is : "+ averageMarks);
    }
}
class Testers{
    public static void main(String[] args) {
        Marks[] marks={new A(50,50,60),new B(60,80,90,80)};
        for (Marks mark : marks) {
            mark.getPercentage();

        }
    }
}