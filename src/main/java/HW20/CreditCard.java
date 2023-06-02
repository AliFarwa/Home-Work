package HW20;

import Practice1.A;

public  class CreditCard {
    //Create a class CreditCard and define variable balance and interest.
    // Create an instance method that will calculate interest based on the given balance.
int interest;
int balance;

    void calculateInterest(int interest, int balance){
     double result=interest*balance;
            System.out.println("The interest is = " + result);
        }
}
class Visa extends CreditCard{

    }


class AX extends CreditCard{
@Override
void calculateInterest(int interest, int balance){
    double result=interest*balance;
    System.out.println("The interest is = " + result);
}

}
  class CreditCardTester{
    public static void main(String[] args) {
      CreditCard obj=new CreditCard();
       obj.calculateInterest(20,20);

       Visa visa=new Visa();
       visa.calculateInterest(30,40);

       AX ax=new AX();
       ax.calculateInterest(20,40);

    }
}