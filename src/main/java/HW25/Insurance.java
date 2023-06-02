package HW25;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Insurance {

   String insurancename;

    public Insurance(String insurancename) {
        this.insurancename = insurancename;
    }

    abstract void getQuote();
   abstract void cancelinsurance();

}
class Car extends Insurance{

    int carModel;
    Car(String insurancename, int carModel ){
         super(insurancename);
        this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println("Get car insurance  for " + insurancename +" and "+ carModel);
    }

    @Override
    void cancelinsurance() {
        System.out.println("Cancel car insurance  for "+ insurancename+" and "+ carModel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel=" + carModel +
                ", insurancename='" + insurancename + '\'' +
                '}';
    }
}
class Pet extends Insurance{
    String petType;

    public Pet(String insurancename, String petType) {
        super(insurancename);
        this.petType = petType;
    }

    @Override
    void getQuote() {
        System.out.println("Get pet insurance Quote for " + insurancename+ " and "+ petType);
    }

    @Override
    void cancelinsurance() {
        System.out.println("Cancel pet insurance for "+insurancename+" and "+petType);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", insurancename='" + insurancename + '\'' +
                '}';
    }
}
class Health extends Insurance{

    public Health(String insurancename) {
        super(insurancename);
    }

    @Override
    void getQuote() {
        System.out.println(" Get health insurance"+" "+insurancename);
    }

    @Override
    void cancelinsurance() {
        System.out.println("Cancel health insurance"+ " "+insurancename);
    }

    @Override
    public String toString() {
        return "Health{" +
                "insurancename='" + insurancename + '\'' +
                '}';
    }
}
class InsuranceTester {
    public static void main(String[] args) {
        ArrayList<Insurance> insurance = new ArrayList<>();
        insurance.add(new Car("Gieco", 2006));
        insurance.add(new Pet("Liberty", "Pet"));
        insurance.add( new Health("Gieco"));

        //with advanced for loop
        for (Insurance in : insurance) {
           System.out.println(insurance);
          in.getQuote();
          in.cancelinsurance();
        }

        //with normal for loop
        for (int i = 0; i < insurance.size(); i++) {
            System.out.println(insurance.get(i).toString());
            insurance.get(i).cancelinsurance();
            insurance.get(i).getQuote();
        }
        //with iterator
        Iterator<Insurance> iterator = insurance.iterator();
        while((iterator.hasNext())){
          Insurance ins=iterator.next();
           System.out.println(ins);
            ins.getQuote();
            ins.cancelinsurance();
       }
    }
}