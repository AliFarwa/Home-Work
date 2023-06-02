package Review10;

public interface MovaAble {
    void move();
}
class Dog implements MovaAble{
    @Override
    public void move(){
        System.out.println("Dog is moving");
    }
}
