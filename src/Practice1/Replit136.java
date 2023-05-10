package Practice1;

public class Replit136 {

   private void  privateMethod(){
        System.out.println("This is Private Method");
    }
    void defaultMethod(){
        System.out.println("This is Default Method");
    }
    protected void protectedMethod(){
        System.out.println("This is Protected Method");
    }
    public void publicMethod(){
        System.out.println("This is Public Method");
    }
    public static void main(String[] args) {
        Replit136 obj= new Replit136();
        obj.privateMethod();
        obj.defaultMethod();
        obj.protectedMethod();
        obj.publicMethod();
    }
}

