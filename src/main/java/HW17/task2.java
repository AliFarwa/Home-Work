package HW17;

public class task2 {

    String name;
    String grade;
    int age;
    double height;

    public task2(String name, String grade, int age, double height) {
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.height = height;
        System.out.println(name+ " is in "+grade+" her age is "+age+" and her height is "+height );
    }
    private task2(String name, String grade, int age){
        this.name = name;
        this.grade = grade;
        this.age = age;
       System.out.println(name+ "is in "+grade+"her"+age);
    }
    //Default
    task2(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(name+ "and her age is" +age);
    }
    protected task2(int age){
        this.age=age;
        System.out.println("her age is " +age);
    }

    public static void main(String[] args) {
        task2 task =new task2("Dania","Pre-K",4, 3.4);
        task2 task1=new task2("Dania","Second", 4);
        task2 task2=new task2("Dania", 4);
        task2 task3=new task2(4);

    }

}
