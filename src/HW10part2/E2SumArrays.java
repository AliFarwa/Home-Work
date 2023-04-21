package HW10part2;

public class E2SumArrays {
    public static void main(String[] args) {
//Create an array of integer values. After the array is
//created, calculate the sum of all stored elements in
//that array.

        int [][] numbs={{5,5},//row
                       {10,10},
        };
        int sum=0;
        for (int[] numb : numbs) {
            for (int i : numb) {
                sum=sum+i;

            }
        }
        System.out.println(sum);
    }

        }
