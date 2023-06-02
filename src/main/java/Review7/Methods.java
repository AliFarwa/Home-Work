package Review7;

public class Methods {


//method that has no return type.
    void hello(){
        System.out.println("Hello");
    }

    void helloName(String name){

        System.out.println("Hello "+ name);
    }

    public static void main(String[] args) {
        Methods obj=new Methods();
        obj.hello();
        obj.helloName("Farwa");
    }
}
