package HW10part2;

public class E10Duplicate {
    public static void main(String[] args) {
        //Write a program to print out duplicate elements from
        //an Array of Strings?
        int[] number = {10,20,30,20,40,10};
        for (int i = 0; i < number.length ; i++) {
            for (int j=i+1; j < number.length ; j++) {
                if(number[i]==number[j]){
                    System.out.println("The duplicate numbers are" + number[j]);
                }

            }

        }

    }
}
