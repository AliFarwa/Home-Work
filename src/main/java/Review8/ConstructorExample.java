package Review8;

public class ConstructorExample {

    ConstructorExample(){
        System.out.println("I created non-argument constructor");
    }

ConstructorExample(String str){

    System.out.println("Parameterised constructor");
}


    public static void main(String[] args) {
       ConstructorExample obj= new ConstructorExample();//calling a constructor of constructorexample

        ConstructorExample obj1= new ConstructorExample("Farwa");
    }
}
