package Practice1;

import Review1.Practice1;

public class Country {
    String country;
    String capital;
    int populaionSize;
    public static void main(String[] args) {

        Country obj=new Country();
        obj.country="USA";
        obj.capital="Washington DC";
        obj.populaionSize=33000000;
        System.out.println("The capital of " +obj.country+ " is "+  obj.capital+ " and population is " +obj.populaionSize);

        Country obj1=new Country();
       obj1.country="Kazakhstan";
       obj1.capital="Astana";
       obj1.populaionSize=18500000;
        System.out.println("The capital of " +obj1.country+ " is "+  obj1.capital+ " and population is " +obj1.populaionSize);
    }

    }


